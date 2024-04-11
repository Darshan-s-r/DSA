package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElement {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(10);
        root.left.right = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(4);
        System.out.println(kthSmallest(root, 5));
        System.out.println(kthSmallest1(root, 5));
    }
   static int count = 0;
   static public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
 static TreeNode helper(TreeNode node, int k){
        if(node == null){
            return null;
        }
        TreeNode left = helper(node.left, k);
        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return node;
        }
        return helper(node.right, k);
}

    static public int kthSmallest1(TreeNode root, int k) {
        List<Integer> list=  helper1(root);
        System.out.println(list);
        return list.get(k - 1);
    }


    static List<Integer> helper1(TreeNode node){
        List<Integer> list = new ArrayList<>();
        if(node == null){
            return list;
        }
        list.addAll(helper1(node.left));
        list.add(node.val);
        list.addAll(helper1(node.right));
        return list;
    }
}
