class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0, i = 0, j = 1, buyp = 0;

        while (j < n) {
            if (prices[i] < prices[j]) {
                buyp = prices[i];
                res = Math.max(res, prices[j] - prices[i]);
                j++;
            } else if (buyp>=prices[j]) {
                i = j;
                buyp = prices[j];
                j++;
            } else {
                i++;
                j++;
            }
        }
        return res;

    }
}