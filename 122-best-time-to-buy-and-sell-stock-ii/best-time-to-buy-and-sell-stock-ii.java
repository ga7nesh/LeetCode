class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=1,profit=0;
        int n = prices.length;

        while(j<n){
            if(prices[i]<prices[j]){
                profit = profit + prices[j] - prices[i];
                i++;j++;
            }
            else{
                i++;j++;
            }
        }
        return profit;
    }
}