package LinkedList;

public class MergeSort {
    public ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sort(head);
        ListNode right = sort(mid);

        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode newNode = null;
        ListNode temp = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (newNode == null) {
                    newNode = list1;
                    temp = newNode;
                } else {
                    newNode.next = list1;
                    list1 = list1.next;
                }
            } else {
                if (newNode == null) {
                    newNode = list2;
                    temp = newNode;
                } else {
                    newNode.next = list2;
                    list2 = list2.next;
                }
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

        return temp;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }
    }

}
