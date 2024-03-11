package LinkedList;

public class DLLWithGenerics <TYPE> {
    private NodeDLL head;
    private NodeDLL tail;
    private int size;

//    private NodeDLL createNode(NodeDLL prev, TYPE val, NodeDLL next){
//        NodeDLL node = new NodeDLL(prev, val, next);
//        return node;
//    }

    public void insertFirst(TYPE val){
        if(head == null){
           NodeDLL node = new NodeDLL(null, val, null);
           head = node;
           tail = node;
           size += 1;
           return;
        }
        NodeDLL node = new NodeDLL(null, val, head);
        head = node;
        size += 1;
    }

    public void insertLast(TYPE val){
        if(head == null){
            NodeDLL node = new NodeDLL(null, val, null);
            head = node;
            tail = node;
            size += 1;
            return;
        }
        NodeDLL node = new NodeDLL(tail, val, null);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(TYPE val, int index) {
        if(index >= size && index < 0){
            System.out.println("index out of bounds " + index);
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
        if(index < (int)(size/2)){
            NodeDLL temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            NodeDLL node = new NodeDLL(temp, val, temp.next);
            temp.next = node;
            size += 1;
        }else {
            int move = size - index;
            NodeDLL temp = tail;
            for (int i = 1; i <= move; i++) {
                temp = temp.prev;
            }
            NodeDLL node = new NodeDLL(temp, val, temp.next);
            temp.next = node;
            size += 1;
        }

    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty to delete");
            return;
        }
        head = head.next;
        head.prev = null;
        size -= 1;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("list is empty to delete");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size -= 1;
    }
    public void delete(int index){
        if(index >= size && index < 0){
            System.out.println("index out of bounds " + index);
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        if(index < (int)(size/2)){
            NodeDLL temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size -= 1;
        }else {
            int move = size - index;
            NodeDLL temp = tail;
            for (int i = 1; i <= move; i++) {
                temp = temp.prev;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size -= 1;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        NodeDLL temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


        private class NodeDLL {
       private NodeDLL prev;
       private TYPE val;
       private NodeDLL next;

       NodeDLL(NodeDLL prev, TYPE val, NodeDLL next){
           this.prev = prev;
           this.val = val;
           this.next = next;
       }
    }
}
