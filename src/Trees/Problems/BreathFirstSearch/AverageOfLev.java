package Trees.Problems.BreathFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLev {
    public AverageOfLev() {
    }

    public static void main(String[] args) {
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for(int i = 0; i < size; ++i) {
                TreeNode currentNode = (TreeNode)queue.poll();
                sum += currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            double avg = (double)(sum / size);
            list.add(avg);
        }

        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(final AverageOfLev this$0) {
        }

        TreeNode(final AverageOfLev this$0, int val) {
            this.val = val;
        }

        TreeNode(final AverageOfLev this$0, int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
