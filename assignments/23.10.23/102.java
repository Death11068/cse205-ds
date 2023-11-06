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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> curr = new ArrayList<>();

        while(!q.isEmpty()){
            TreeNode tem = q.poll();
            if(tem != null){ 
                curr.add(tem.val);
                if(tem.left != null) q.add(tem.left);
                if(tem.right != null) q.add(tem.right);
            }else{
                List<Integer> c_curr = new ArrayList<Integer>(curr);
                res.add(c_curr);
                curr.clear();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }  
    }

    return res;
        
    }
}