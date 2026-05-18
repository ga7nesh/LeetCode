class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, res = nums[0];

        int[] maxVal = new int[n];
        int[] minVal = new int[n];

        maxVal[0] = nums[0];
        minVal[0] = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            maxVal[i] = Math.max(curr, Math.max(curr * maxVal[i - 1], curr * minVal[i - 1]));
            minVal[i] = Math.min(curr, Math.min(curr * maxVal[i - 1], curr * minVal[i - 1]));
            res = Math.max(res, maxVal[i]);
        }

        return res;
    }
}