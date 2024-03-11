package LinkedList;

public class LLWithGenerics <TYPE> {

    private Node head;
    private Node tail;

    private int size;
    public LLWithGenerics(){
        this.size = 0;
    }

    public void insertFirst(TYPE val){
        if(head == null){
            Node node = new Node(val, null);
            head = node;
            tail = node;
            size += 1;
            return;
        }
        Node node = new Node(val, head);
        head = node;
        size += 1;
    }

    public void insertLast(TYPE val){
        if(head == null){
            Node node = new Node(val, null);
            head = node;
            tail = node;
            size += 1;
            return;
        }
        Node temp = head;
        for (int i = 1; i < size; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, null);
        temp.next = node;
        tail = node;
        size += 1;
    }

    public void insert(TYPE val, int index){
        if(index >= size && index < 0){
            System.out.println("index out of bounds" + index);
            return;
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size-1){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty to delete");
            return;
        }
        head = head.next;
        size -= 1;
    }


    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty to delete");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=  null;
        tail = temp;
        size -=1;
    }
    public void delete(int index){
        if(index >= size && index < 0){
            System.out.println("element is not exist in the index" + index);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void display(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private TYPE val;
        private Node next;

        public Node(TYPE val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
