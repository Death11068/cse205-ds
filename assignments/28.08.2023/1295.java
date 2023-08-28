class Solution {
   public int findNumbers(int[] nums) {
        int count = 0, evenNo = 0;
        for(int i = 0; i < nums.length; i++){
           int j = nums[i];
            while(j > 0){
                count++;
                j/= 10;
            }
          if(count %2 == 0)
              evenNo++;
            count = 0;
        }
      return evenNo;
    }
}