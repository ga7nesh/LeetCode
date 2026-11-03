class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length, i = 0;
        int[] arr = new int[n];
        while (i <= n) {
            for (int x = 0; x < nums.length; x++) {
                arr[i] = nums[x];
                i++;
            }
            n--;
        }
        return arr;
    }
}