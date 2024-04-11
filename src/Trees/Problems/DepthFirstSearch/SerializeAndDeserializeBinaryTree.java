package Trees.Problems.DepthFirstSearch;
import Trees.Problems.DepthFirstSearch.DiameterOfBinaryTree.TreeNode;
import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

//for more detail https://www.youtube.com/watch?v=9D-vP-jcc-Y&list=PPSV 3:40:00
public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.right = new TreeNode(10);
        root.left.right = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(4);
        String str = serialize(root);
        System.out.println(str);
        System.out.println(deserialize(str));


    }

    // Encodes a tree to a single string.
    static StringBuffer str = new StringBuffer();
    static public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
         helper(root, str);
         return str.toString();
    }

    static void helper(TreeNode node, StringBuffer str){
        if(node == null){
            str.append("null,");
            return;
        }
        str.append(node.val + ",");
        helper(node.left, str);
        helper(node.right, str);
    }

    // Decodes your encoded data to tree.
    static public TreeNode deserialize(String data) {
        if(data == null){
            return null;
        }
         String arr[] = data.split(",");
//        List<String> list = Arrays.asList(arr);
         return helper( arr, new int[]{0});

    }

    static TreeNode helper( String []arr, int[] index){
        if(arr[index[0]].equals("")){
            return null;
        }
        if(index[0] == arr.length){
            return null;
        }
        if(arr[index[0]].charAt(0) == 'n'){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index[0]]));
        index[0]++;
        root.left = helper(arr, index);
        index[0]++;
        root.right = helper(arr, index);
        return root;
    }

}
