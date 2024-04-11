package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

public class HasPath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(10);
        root.left.right = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(4);
        System.out.println(hasPath(root, new int[] {9, 7, 5, 6}));
    }
   static public boolean hasPath(TreeNode root, int [] arr){
        if(root == null || arr.length == 0){
            return false;
        }
        return helper(root, arr, 0);
    }

   static public boolean helper(TreeNode node, int [] arr, int level){
        if(node == null){
            return false;
        }
        if(level >= arr.length || node.val != arr[level]){
            return false;
        }
        if(node.left == null && node.right == null && level == arr.length - 1 && node.val == arr[level]){
            return true;
        }
            return helper(node.left, arr, level+1) || helper(node.right, arr, level+1);
    }
}
