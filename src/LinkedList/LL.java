package LinkedList;

public class LL<TYPE> {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public Node getHead(){
        return head;
    }

    public void insertFirst(int val) {
        if (head == null) {
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

    public void insertLast(int val) {
        if (head == null) {
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

    public void insert(int val, int index) {
        if (index >= size && index < 0) {
            System.out.println("index out of bounds" + index);
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size - 1) {
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

    public int deleteFirst() {
        if (head == null) {
            System.out.println("list is empty to delete");
            return Integer.MIN_VALUE;
        }
        int dltVal = head.val;
        head = head.next;
        size -= 1;
        return dltVal;
    }


    public int deleteLast() {
        if (head == null) {
            System.out.println("list is empty to delete");
            return Integer.MIN_VALUE;
        }
        int dltVal = tail.val;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size -= 1;
        return dltVal;
    }

    public int delete(int index) {
        if (index >= size && index < 0) {
            System.out.println("element is not exist in the index" + index);
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int dltVal = temp.next.val;
        temp.next = temp.next.next;
        return dltVal;
    }

    public void display() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    ///////////////INSERT USING RECURSION////////
    public void insertRec(int val, int index) {
        insertRec(val, index, head);
    }

    private void insertRec(int val, int index, Node node) {
        if (index == 1) {
            Node temp = new Node(val, node.next);
            node.next = temp;
            size += 1;
            return;
        }
        insertRec(val, index - 1, node.next);

    }

    //////////QUESTIONS/////////
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
        public Node mergeTwoLists(Node list1, Node list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }

            Node newNode = new Node();
            Node temp = newNode;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    newNode.next = list1;
                    list1 = list1.next;
                } else {
                    newNode.next = list2;
                    list2 = list2.next;
                }
                newNode = newNode.next;
            }

            while (list1 != null) {
                newNode.next = list1;
                list1 = list1.next;
                newNode = newNode.next;
            }

            while (list2 != null) {
                newNode.next = list2;
                list2 = list2.next;
                newNode = newNode.next;
            }

            return temp.next;
        }

//        ----------------------------FIND CYCLIC IN THE LIST----------------

    public boolean hasCycle(Node head) {
        Node f = head;
        Node s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return true;
            }

        }
        return false;
    }
//    --------------------FIND THE LENGTH OF THE CYCLE----------------
public int FindEleInCycle(Node head) {
    Node f = head;
    Node s = head;
    int count = 0;
    while(f != null && f.next != null){
        f = f.next.next;
        s = s.next;
        if(f == s){

            do{
                s = s.next;
                count++;
            }while(f != s);
            return count;
        }

    }
    return count;
}

//--------------------FIND THE NODE THAT STARTING THE CYCLE-------------
    public Node FindNodeStartingCycle(Node head) {
        Node f = head;
        Node s = head;
        int count = 0;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {

                do {
                    s = s.next;
                    count++;
                } while (f != s);
                f = head;
                s = head;
                for (int i = 1; i <= count; i++) {
                    s = s.next;
                }
                while (f != s) {
                    f = f.next;
                    s = s.next;
                }
                return f;
            }
        }
        return null;
    }
//--------------------HAPPT NUMBER----------------------
    public boolean isHappyNo(int num){
        int slow = num;
        int fast = num;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    private int square(int num){
        int square = 0;
        while(num > 0){
            int rem = num%10;
            num = num/10;
            square += rem * rem;
        }
        return square;
    }

//    --------------------------FIND THE MIDDLE OF THE LINKED LIST

    public Node middleNode(Node head){

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //-----------------------REVERSE A LINKED LIST USINFG RECURSION-------------------------

    public void reverseRec(Node node){
        if(node == tail){
           head = tail;
           return;
        }
        reverseRec(node.next);
            tail.next = node;
            tail = node;
            tail.next = null;
    }

   // -----------------IN PLACE REVERSAL OF THE LINKED LIST-------------
    public Node reverce(Node head){
        if(head.next == null){
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }

        }
        head = prev;
        return head;

    }
//    ---------REVERSE A LINKED LIST || ------------------
public Node reverseBetween(Node head, int left, int right) {
    if(left == right){
        return head;
    }
    Node current = head;
    Node prev = null;
    for(int i = 0; current != null && i < left - 1; i++){
        prev = current;
        current = current.next;
    }
   Node last = prev;
    Node newEnd = current;

   Node next = current.next;
    for(int i = 0; current != null && i< right - left + 1;i++){
        current.next = prev;
        prev = current;
        current = next;
        if(next != null){
            next = next.next;
        }
    }
    if(last != null){
        last.next = prev;
    }
    else {
        head =prev;
    }
    newEnd.next = current;
    return head;

}

public Node reverseKGroup(Node head, int k){
        if(k <= 1 || head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next;
    Node checkNode = head;
    for (int i = 0; i < k; i++) {
        if (checkNode == null) {
            return head; // There are fewer than k nodes remaining, no need to reverse
        }
        checkNode = checkNode.next;
    }
        while(true){
            Node last = prev;
            Node newEnd = current;
            for (int i = 0; current != null &&i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;

            }
            if(last != null){
                last.next = prev;
            }
            else {
                head = prev;
            }
            if(current == null){
                break;
            }
            prev = newEnd;
            newEnd.next = current;
            checkNode = head;
            for (int i = 0; i < k; i++) {
                if (checkNode == null) {
                    return head; // There are fewer than k nodes remaining, no need to reverse
                }
                checkNode = checkNode.next;
            }
        }

        return head;
}
//-----------------------IS PALENDROM----------------------

    public boolean isPalindrome(Node head) {
        // Find the mid
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node prev = null;
        Node current = mid;
        Node next;

        // Reverse the second half
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node reversedSecondHalf = prev;

        // Compare the reversed second half with the first half
        Node headRev = head;
        Node temp = reversedSecondHalf;
        int count = 1;

        while (headRev != null && temp != null) {
            if (headRev.val != temp.val) {
                count = 0;
                break;
            }
            headRev = headRev.next;
            temp = temp.next;
        }

        // Reverse the second half back to its original order
        prev = null;
        current = reversedSecondHalf;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void reorderList(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node mid = middleNode(head);
        Node revHead = reverce(mid);
        Node fh = head;
        Node sh = revHead;
        while(fh != null && sh != null){
            Node temp = fh.next;
            fh.next = sh;
            fh = temp;

            temp = sh.next;
            sh.next = fh;
            sh = temp;
        }

        //next of tail to null
        if(fh != null){
            fh.next = null;
        }

    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        public Node(){

        }
    }
}
