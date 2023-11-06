class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int count = 0;  
        for(int num : nums){
            if(hm.containsKey(num)){
                count = count + hm.get(num);
                hm.put(num, hm.get(num) + 1);
            }else{
                hm.put(num,1);
            }
        }

        return count;        
    }
}
