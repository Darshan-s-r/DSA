
package Trees.Problems.BreathFirstSearch;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {
    public ZigZagTraversal() {
    }

    public static void main(String[] args) {
        BFStreeTraversal.TreeNode root = new BFStreeTraversal.TreeNode(1);
        root.left = new BFStreeTraversal.TreeNode(2);
        root.right = new BFStreeTraversal.TreeNode(3);
        root.left.left = new BFStreeTraversal.TreeNode(4);
        root.left.right = new BFStreeTraversal.TreeNode(5);
        root.right.left = new BFStreeTraversal.TreeNode(6);
        root.right.right = new BFStreeTraversal.TreeNode(7);
        root.left.left.left = new BFStreeTraversal.TreeNode(8);
        root.left.left.right = new BFStreeTraversal.TreeNode(9);
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(BFStreeTraversal.TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        } else {
            Deque<BFStreeTraversal.TreeNode> deque = new LinkedList();
            int level = 1;
            deque.addFirst(root);

            while(!deque.isEmpty()) {
                List<Integer> list = new ArrayList();
                int size = deque.size();
                int i;
                BFStreeTraversal.TreeNode node;
                if (level % 2 == 0) {
                    for(i = 0; i < size; ++i) {
                        node = (BFStreeTraversal.TreeNode)deque.pollLast();
                        if (node.right != null) {
                            deque.offerFirst(node.right);
                        }

                        if (node.left != null) {
                            deque.offerFirst(node.left);
                        }

                        list.add(node.val);
                    }
                } else {
                    for(i = 0; i < size; ++i) {
                        node = (BFStreeTraversal.TreeNode)deque.pollFirst();
                        if (node.left != null) {
                            deque.offerLast(node.left);
                        }

                        if (node.right != null) {
                            deque.offerLast(node.right);
                        }

                        list.add(node.val);
                    }
                }

                ++level;
                result.add(list);
            }

            return result;
        }
    }
}
