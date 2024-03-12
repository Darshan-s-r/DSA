
package Trees.Implementation;

public class SegmentTree {
    Node root;

    public SegmentTree() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 7, 6, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree();
        tree.create(arr);
        tree.display();
        tree.update(3, 12);
        System.out.println("ofter update");
        tree.display();
    }

    public void create(int[] arr) {
        this.root = this.create(arr, 0, arr.length - 1);
    }

    private Node create(int[] arr, int startIndex, int endIndex) {
        Node node;
        if (startIndex == endIndex) {
            node = new Node(this, startIndex, endIndex);
            node.data = arr[startIndex];
            return node;
        } else {
            node = new Node(this, startIndex, endIndex);
            int mid = (startIndex + endIndex) / 2;
            node.left = this.create(arr, startIndex, mid);
            node.right = this.create(arr, mid + 1, endIndex);
            node.data = node.left.data + node.right.data;
            return node;
        }
    }

    public void update(int index, int value) {
        this.root.data = this.update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = this.update(node.left, index, value);
                int rightAns = this.update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        } else {
            return node.data;
        }
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "interval [" + node.left.startInterval + " - " + node.left.endInterval + "] and data is " + node.left.data + "=>";
        } else {
            str = str + "no left child";
        }

        str = str + "interval [" + node.startInterval + " - " + node.endInterval + "] and data is " + node.data + "<=";
        if (node.right != null) {
            str = str + "interval [" + node.right.startInterval + " - " + node.right.endInterval + "] and data is " + node.right.data;
        } else {
            str = str + "no right child";
        }

        System.out.println(str);
        if (node.left != null) {
            this.display(node.left);
        }

        if (node.right != null) {
            this.display(node.right);
        }

    }

    public int query(int si, int ei) {
        return this.query(this.root, si, ei);
    }

    private int query(Node node, int si, int ei) {
        if (node.startInterval >= si && node.endInterval <= ei) {
            return node.data;
        } else if (node.startInterval <= ei && node.endInterval >= si) {
            int left = this.query(node.left, si, ei);
            int right = this.query(node.right, si, ei);
            return left + right;
        } else {
            return 0;
        }
    }

    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(final SegmentTree var1, int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
}
