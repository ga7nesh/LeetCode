class Solution {
    public int maxProfit(int[] prices) {
        int buyp = prices[0],i=0,j=0, profit = 0;
        int n = prices.length;

        while(j<n){
            if(prices[j]<prices[i]){
                i=j;
                buyp=prices[i];
            }
            else{
                profit = Math.max(profit,prices[j]-prices[i]);
            }
            j++;
        }
        return profit;
    }
}