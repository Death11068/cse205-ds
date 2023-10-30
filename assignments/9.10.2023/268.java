import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int leng=nums.length;
        
        for(int i=0;i<leng;i++)
        {
            if(nums[i]!=i)
            {
               return i;
            }
            
        }
        return leng;
    }
}