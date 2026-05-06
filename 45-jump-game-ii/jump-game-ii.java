class Solution {
    public int jump(int[] nums) {
        int fartestJump = 0, currEnd = 0;
        int i = 0, count = 0;
        int n = nums.length;

        while (i < n-1) {
            fartestJump = Math.max(fartestJump, i+nums[i]);

            if(i==currEnd){
                count++;
                currEnd = fartestJump;
            }
            i++;
        }
        return count;
    }
}