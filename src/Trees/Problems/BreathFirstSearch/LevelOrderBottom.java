
package Trees.Problems.BreathFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public LevelOrderBottom() {
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
        System.out.println(levelOrderBottom(root));
    }

    public static List<List<Integer>> levelOrderBottom(BFStreeTraversal.TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        } else {
            Queue<BFStreeTraversal.TreeNode> queue = new LinkedList();
            queue.offer(root);

            while(!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList();

                for(int i = 0; i < levelSize; ++i) {
                    BFStreeTraversal.TreeNode node = (BFStreeTraversal.TreeNode)queue.poll();
                    currentLevel.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                result.addFirst(currentLevel);
            }

            return result;
        }
    }
}
