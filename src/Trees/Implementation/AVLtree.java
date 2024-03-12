package Trees.Implementation;

public class AVLtree {
    class Node {
        private int value;
        private Node left;
        private Node right;
        public int height;

        public Node(final AVLtree var1, int value) {
            this.value = value;
        }
    }
    private Node root;

    public AVLtree() {
    }

    public int height() {
        return this.root.height;
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
            return this.rotate(node);
        }
    }

    private Node rotate(Node node) {
        if (this.height(node.left) - this.height(node.right) > 1) {
            if (this.height(node.left.left) - this.height(node.left.right) < 0) {
                return this.rightRotate(node);
            }

            if (this.height(node.left.left) - this.height(node.left.right) > 0) {
                return this.leftRotate(node.left);
            }
        }

        if (this.height(node.left) - this.height(node.right) < -1) {
            if (this.height(node.right.left) - this.height(node.right.right) > 0) {
                return this.rightRotate(node.right);
            }

            if (this.height(node.right.left) - this.height(node.right.right) < 0) {
                return this.leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = p.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(this.height(p.right), this.height(p.left) + 1);
        c.height = Math.max(this.height(c.left), this.height(c.right) + 1);
        return c;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = p.left;
        c.left = p;
        p.right = t;
        p.height = Math.max(this.height(p.right), this.height(p.left) + 1);
        c.height = Math.max(this.height(c.left), this.height(c.right) + 1);
        return c;
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

    public static void main(String[] args) {
        AVLtree tree = new AVLtree();

        for(int i = 0; i < 22; ++i) {
            tree.insert(i);
        }

        tree.display();
        System.out.println(tree.height());
    }
}
