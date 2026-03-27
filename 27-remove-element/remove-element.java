class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0,j=n-1;

        while(i<=j){
           if(nums[i]==val && nums[j]==val){
                j--;
           }
           else if(nums[j]==val){
            j--;
           }
           else if(nums[i]==val){
            nums[i] = nums[j];
            i++;j--;
           }
           else{
            i++;
           }
        }
        return i;
    }
}