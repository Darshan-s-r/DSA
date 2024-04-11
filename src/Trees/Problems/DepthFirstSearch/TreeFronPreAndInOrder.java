package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.Arrays;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class TreeFronPreAndInOrder {
    public static void main(String[] args) {
        int pre[] = {3, 9, 20, 15, 7};
        int in[] = {9, 3, 15, 20, 7};
        buildTree(pre, in);
    }
    static public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 && inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = findIndex(inorder, preorder[0]);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1,index +1),Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index +1, preorder.length),Arrays.copyOfRange(inorder,  index + 1, inorder.length));
        return root;
    }

    static int findIndex(int[] arr, int ele){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                return i;
            }
        }
        return 0;
    }
}
