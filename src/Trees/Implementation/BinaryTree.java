
package Trees.Implementation;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    public void populate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the root Node ");
        int value = scanner.nextInt();
        this.root = new Node(this, value);
        this.populate(scanner, this.root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("do u want to enter the left of " + node.value);
        int left = scanner.nextInt();
        int right;
        if (left == 1) {
            System.out.println("enter the left of " + node.value);
            right = scanner.nextInt();
            node.left = new Node(this, right);
            this.populate(scanner, node.left);
        }

        System.out.println("do u want to enter the right of " + node.value);
        right = scanner.nextInt();
        if (right == 1) {
            System.out.println("enter the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(this, value);
            this.populate(scanner, node.right);
        }

    }

    public void display() {
        this.display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node != null) {
            System.out.println(indent + node.value);
            this.display(node.left, indent + "\t");
            this.display(node.right, indent + "\t");
        }
    }

    public void prittyDisplay() {
        this.prittyDisplay(this.root, 0);
    }

    private void prittyDisplay(Node node, int level) {
        if (node != null) {
            this.prittyDisplay(node.right, level + 1);
            if (level != 0) {
                for(int i = 0; i < level - 1; ++i) {
                    System.out.print("|\t\t");
                }

                System.out.println("|------>" + node.value);
            } else {
                System.out.println(node.value);
            }

            this.prittyDisplay(node.left, level + 1);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        tree.display();
        tree.prittyDisplay();
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(final BinaryTree var1, int value) {
            this.value = value;
        }

        public Node(final BinaryTree var1) {
        }
    }
}
