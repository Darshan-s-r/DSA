package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flatten(root);
        display(root);
    }
   static public void flatten(TreeNode root) {
        if(root == null){
            return ;
        }
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;

        }
    }

    static void display(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + "-->");
        display(root.right);
    }
}
