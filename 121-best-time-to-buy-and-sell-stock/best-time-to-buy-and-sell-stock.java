class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyp = prices[0];
        int j = 1, profit = 0;

        while(j<n){
            if(buyp<prices[j]){
                profit = Math.max(profit, prices[j] - buyp);
            }
            else{
                buyp = prices[j];
            }
            j++;
        }
        return profit;
    }
}