class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean leftToRight = true;
        List<Integer> curr = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode tem = q.poll();
            if(tem != null){
                curr.add(tem.val);
                if (tem.left != null) q.add(tem.left);
                if (tem.right != null) q.add(tem.right);
            }else{
                if(leftToRight){
                    List<Integer> c_curr = new ArrayList<>(curr);
                    res.add(c_curr);
                    curr.clear();
                }else{
                    Stack<Integer> s = new Stack<Integer>();
                    s.addAll(curr);
                    List<Integer> c_curr = new ArrayList<>();
                    while(!s.isEmpty()){
                        c_curr.add(s.pop());
                    }
                    res.add(c_curr);
                    curr.clear();
                }
                if(!q.isEmpty()){
                    q.add(null);
                    leftToRight =!leftToRight;
                }
            }
        }
        return res;
    }
}