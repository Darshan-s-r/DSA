
package Trees.Problems.BreathFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NextEleInATree {
    public NextEleInATree() {
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
        System.out.println(FindNext(root, 6));
    }

    public static int FindNext(BFStreeTraversal.TreeNode root, int num) {
        new ArrayList();
        Queue<BFStreeTraversal.TreeNode> queue = new LinkedList();
        queue.offer(root);

        BFStreeTraversal.TreeNode currentNode;
        do {
            if (queue.isEmpty()) {
                return -1;
            }

            int size = queue.size();
            currentNode = (BFStreeTraversal.TreeNode)queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        } while(currentNode.val != num || queue.peek() == null);

        BFStreeTraversal.TreeNode ans = (BFStreeTraversal.TreeNode)queue.poll();
        return ans.val;
    }
}
