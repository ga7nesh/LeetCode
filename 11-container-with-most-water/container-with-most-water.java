class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int h=0,w=0,i=0,j=n-1, max=0;

        while(i<j){
            w=j-i;
            h=Math.min(height[i],height[j]);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            max = Math.max(h*w,max);

        }
        return max;
    }
}