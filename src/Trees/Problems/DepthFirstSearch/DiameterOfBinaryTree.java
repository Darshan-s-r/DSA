package Trees.Problems.DepthFirstSearch;
//https://leetcode.com/problems/diameter-of-binary-tree/description/
public class DiameterOfBinaryTree {
    public static void main(String[] args) {

    }
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    private int height(TreeNode node) {
        if(node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right + 1;
        diameter = Math.max(diameter, dia);
        return Math.max(left, right) + 1;
    }


}
