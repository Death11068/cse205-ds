class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> comb=new ArrayList();
        generateCombination(0,candidates, new ArrayList<>(),comb,target);
        
        return comb;
        
    }
        void generateCombination(int start, int[] nums, List<Integer> current, List<List<Integer>> comb, int target)
        {   
            
            if (target == 0) {
            comb.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            if (target - nums[i] >= 0) {
                current.add(nums[i]);
                generateCombination(i, nums, current, comb, target - nums[i]);
                current.remove(current.size() - 1);
            }
        }
        
    }}