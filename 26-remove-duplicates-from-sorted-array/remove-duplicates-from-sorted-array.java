class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,k=0;
        int n = nums.length, count =0;

        while(i<n && j<n){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                count++;
            }
        }
        return count+1;
    }
}