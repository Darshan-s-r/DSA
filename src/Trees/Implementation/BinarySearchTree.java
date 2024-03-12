package Trees.Implementation;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public void populate(int[] nums) {
        for(int i = 0; i < nums.length; ++i) {
            this.insert(nums[i]);
        }

    }

    public void populateSorted(int[] nums) {
        this.populateSorted(nums, 0, nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (end >= start) {
            int mid = (start + end) / 2;
            this.insert(nums[mid]);
            this.populateSorted(nums, start, mid - 1);
            this.populateSorted(nums, mid + 1, end);
        }
    }

    public void insert(int value) {
        this.root = this.insert(value, this.root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(this, value);
        } else {
            if (value < node.value) {
                node.left = this.insert(value, node.left);
            }

            if (value > node.value) {
                node.right = this.insert(value, node.right);
            }

            node.height = Math.max(this.height(node.left), this.height(node.right)) + 1;
            return node;
        }
    }

    public void display() {
        this.display(this.root, 0);
    }

    private void display(Node node, int level) {
        if (node != null) {
            this.display(node.right, level + 1);
            if (level != 0) {
                for(int i = 0; i < level - 1; ++i) {
                    System.out.print("|\t\t");
                }

                System.out.println("|---->" + node.value);
            } else {
                System.out.println(node.value);
            }

            this.display(node.left, level + 1);
        }
    }

    public boolean balenced() {
        return this.balenced(this.root);
    }

    private boolean balenced(Node node) {
        if (node == null) {
            return true;
        } else {
            return Math.abs(this.height(node.left) - this.height(node.right)) <= 1 && this.balenced(node.left) && this.balenced(node.right);
        }
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print("-->" + node.value);
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
    }

    private void inOrder() {
        this.preOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            this.inOrder(node.left);
            System.out.print("-->" + node.value);
            this.inOrder(node.right);
        }
    }

    private void postOrder() {
        this.preOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            this.postOrder(node.left);
            this.postOrder(node.right);
            System.out.print("-->" + node.value);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree tree2 = new BinarySearchTree();
        tree.populateSorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        tree2.populate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        tree.display();
        System.out.println("pre order traversal");
        tree2.preOrder();
        System.out.println("\n in order traversal");
        tree2.inOrder();
        System.out.println("\n post order traversal");
        tree2.postOrder();
        System.out.println("\n==================================================================");
        tree2.display();
        System.out.println("isBalenced --> " + tree.balenced());
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(final BinarySearchTree var1, int value) {
            this.value = value;
        }
    }
}
