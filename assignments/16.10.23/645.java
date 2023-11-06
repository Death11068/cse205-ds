class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(i+1)) ans[1]=i+1;
            else if(map.get(nums[i])==2) ans[0]=nums[i];
        }
        return ans;
    }
}