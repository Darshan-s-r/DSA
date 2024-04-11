package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;
//https://leetcode.com/problems/validate-binary-search-tree/
public class IsVakidBST {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);

    }

    boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
         if(low != null && node.val <= low){
             return false;
         }
         if(high != null && node.val >= high){
             return false;
         }
         return helper(node.left, low, node.val) && helper(node.right, node.val, high);
    }
}
