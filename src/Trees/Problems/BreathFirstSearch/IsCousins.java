package Trees.Problems.BreathFirstSearch;
import Trees.Problems.BreathFirstSearch.BFStreeTraversal.TreeNode;

//https://leetcode.com/problems/cousins-in-binary-tree/description/
public class IsCousins {
    public static void main(String[] args) {

    }

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        if(level(root, xx, 0) == level(root, yy, 0) && !isSibligns(root, xx, yy)){
            return true;
        }
        return false;
    }

    private boolean isSibligns(TreeNode node, TreeNode xx, TreeNode yy) {
        if(node == null){
            return false;
        }
       return ((node.left == xx && node.right == yy) || (node.right == xx && node.left == yy) || isSibligns(node.left, xx, yy) || isSibligns(node.right, xx, yy));

    }

    TreeNode findNode(TreeNode node, int val){
        if(node == null){
            return null;
        }
        if(node.val == val){
            return node;
        }

        TreeNode n = findNode(node.left, val);
        if(n != null){
            return n;
        }
        return findNode(node.right, val);
    }

    int level(TreeNode node, TreeNode x, int level){
        if(node == null){
            return 0;
        }
        if(node == x){
            return level;
        }
        int l = level(node.left, x, level+1);
        if(l != 0){
            return l;
        }
        return level(node.right, x, level+1);
    }
}
