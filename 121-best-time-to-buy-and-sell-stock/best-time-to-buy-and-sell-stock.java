class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, buyp = 0, sellp = 0, maxprofit = 0;
        int n = prices.length;

        while (j < n) {
            if (prices[i] < prices[j]) {
                buyp = prices[i];
                sellp = prices[j];
                maxprofit = Math.max(maxprofit, sellp - buyp);
                j++;
            } else if (buyp >= prices[j]) {
                i = j;
                buyp = prices[j];
                j++;
            } else {
                i++;
                j++;

            }
        }
        return maxprofit;
    }
}