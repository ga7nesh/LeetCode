class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0, j = 1, profit = 0, max = 0;

        while (j < n) {
            if (prices[i] > prices[j]) {
                i = j;
                j++;
            } else {
                profit = prices[j] - prices[i];
                max = Math.max(profit, max);
                j++;
            }
        }
        return max;

    }
}