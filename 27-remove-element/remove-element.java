class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, i = 0;
        int j = n-1;

        while (i <= j) {
            if (nums[i] != val) {
                i++;
            } 
            else if(nums[j]==val){
                j--;
            }
            else {
                nums[i] = nums[j];
                j--;
            }
        }
        return i;
    }
}