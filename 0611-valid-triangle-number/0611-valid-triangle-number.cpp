class Solution {
public:
    int triangleNumber(vector<int>& nums) {
        int cnt=0;
        sort(nums.begin(),nums.end());
        int n= nums.size();
        for (int k=n-1; k>=2; k--){
            int left=0; int right= k-1;
            while (left<right){
                if (nums[left]+nums[right]<=nums[k]){
                    left++;
                }
                else{
                    cnt+= (right-left);
                    right--;
                }
            }
        }
        return cnt;
    }
};
