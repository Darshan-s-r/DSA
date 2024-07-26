package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.HashSet;
//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

public class TwoSum {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    static boolean helper(TreeNode root, int k, HashSet set){
        if(root == null){
            return false;
        }
        if(!set.contains(k - root.val)){
            set.add(root.val);
           return helper(root.left, k, set) || helper(root.right, k, set);
        }else {
            return true;
        }
    }
}
