/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int depth(TreeNode root){   
        if(root == null) return 0;

        int l_depth = depth(root.left);
        int r_depth = depth(root.right);

        return (l_depth > r_depth) ? l_depth+1 : r_depth+1 ;        
    }

    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true;
        }
        int l = depth(root.left);
        int r = depth(root.right);

        if(Math.abs(l-r) <= 1 ){
           return isBalanced(root.left) && isBalanced(root.right);

        }else{
            return false;
        }
    }
}