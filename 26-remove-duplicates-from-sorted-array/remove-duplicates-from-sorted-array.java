class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        int n = nums.length;

        while (i<n && j<n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            else{
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}