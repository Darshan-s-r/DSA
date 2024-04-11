package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class SumRootToLeafNumbers {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root){
        return helper(root, 0);
    }

   int helper(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
         sum = (sum * 10) + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
   }

}
