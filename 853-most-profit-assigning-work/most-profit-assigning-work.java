class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int k = worker.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { difficulty[i], profit[i] };
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int i = 0, x = 0, res = 0, profits = 0;

        while (x < k) {
            while (i < n && pairs[i][0] <= worker[x]) {
                profits = Math.max(profits, pairs[i][1]);
                i++;
            }
            res += profits;
            x++;
        }

        return res;
    }
}