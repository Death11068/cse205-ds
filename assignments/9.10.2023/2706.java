class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(prices[j]>prices[j+1])
                {
                    int temp=prices[j];
                    prices[j]=prices[j+1];
                    prices[j+1]=temp;
                }
            }
        }
        int mon=-prices[0]-prices[1]+money;
        if (mon>=0)
        {
            return mon;
        }
        else
        {
            return money;
        }
    }
}