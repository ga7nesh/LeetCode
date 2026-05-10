class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0,j=n-1;
        int[] res = new int[2];

        while(i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            else if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else{
                i++;
            }
        }
        return res;
    }
}