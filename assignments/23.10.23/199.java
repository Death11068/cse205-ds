class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        int l = rightSideView(root.right);
        list.add(l.val);
        return list;
        
    }
}