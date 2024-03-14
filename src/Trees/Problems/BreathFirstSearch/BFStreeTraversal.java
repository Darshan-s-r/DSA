
package Trees.Problems.BreathFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFStreeTraversal {
    public BFStreeTraversal() {
    }

    public static void main(String[] args) {
    }

    static List<List<Integer>> traversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        } else {
            Queue<TreeNode> queue = new LinkedList();
            queue.offer(root);

            while(!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList();

                for(int i = 0; i < levelSize; ++i) {
                    TreeNode node = (TreeNode)queue.poll();
                    currentLevel.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                result.add(currentLevel);
            }

            return result;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
