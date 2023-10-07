class Solution {
    public int maximumWealth(int[][] account) {
        int sum1=0;
        for(int i=0; i<account.length;i++){
            int sum2=0;
            for(int j=0; j<account[i].length;j++){
                sum2 = sum2 + account[i][j];
            } 
            sum1 = Math.max(sum1,sum2);
        }
        return sum1;
        
    }
}