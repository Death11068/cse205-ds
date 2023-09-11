class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxi=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<mini)
            {
                mini=prices[i];
            }
            else if(prices[i]-mini>maxi)
            {
                maxi=prices[i]-mini;
            }
        }
        return maxi;
    }}          
           
        
    

