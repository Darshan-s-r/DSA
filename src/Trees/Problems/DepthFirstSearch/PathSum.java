package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(10);
        root.left.right = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(4);
        System.out.println(countSum(root, 9));
    }
    static int countSum(TreeNode root, int sum){
        List<Integer> list = new LinkedList<>();
        return helper(root, sum, list);
    }
    static int helper(TreeNode node, int sum, List<Integer> list){
        if(node == null){
            return 0;
        }
        list.add(node.val);
        int count = 0;
        int s = 0;
        for (int i = list.size()-1; i >= 0 ; i--) {
            s = s + list.get(i);
            if(s == sum){
                count++;
            }
        }

        count += helper(node.left, sum, list) + helper(node.right, sum, list);
        list.remove(list.size()-1);
        return count;
    }
}
