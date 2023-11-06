class Solution {
    Map< Integer,Map<Integer,List<Integer>> > map;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map=new TreeMap<>();
        preorder(root,0,0);
        List<List<Integer>> ans=new ArrayList<>();
        
        for(Integer k:map.keySet()){
            List<Integer> temp=new ArrayList<>();
            for(Integer lk:map.get(k).keySet()){
                Collections.sort(map.get(k).get(lk));
                temp.addAll(map.get(k).get(lk));
            }
            ans.add(temp);
        }
        
        return ans;
    }
    void preorder(TreeNode root,int r,int c){
        if(root==null)  return;
        map.computeIfAbsent(c,k->new TreeMap<>()).
            computeIfAbsent(r,k->new ArrayList<>()).
            add(root.val);
        preorder(root.left,r+1,c-1);
        preorder(root.right,r+1,c+1);
    }
}