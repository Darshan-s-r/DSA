package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GivePathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(10);
        root.left.right = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(4);
        System.out.println(givePath(root, 9));
    }

    static public List<List<Integer>> givePath(TreeNode root, int sum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, sum, path, paths);
        return paths;
    }

    static void helper(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths ){
        if(node == null){
            return;
        }
        path.add(node.val);

        if(node.val == sum && node.left == null && node.right == null){
            paths.add(path);
        }else{
            helper(node.left, sum - node.val, path, paths);
            helper(node.right, sum - node.val, path, paths);
        }

        //back tracing
        path.remove(path.size()-1);
    }
}
