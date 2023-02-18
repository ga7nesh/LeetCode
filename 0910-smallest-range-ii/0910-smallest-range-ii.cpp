class Solution {
public:
    int smallestRangeII(vector<int>& nums, int k) { 
        sort(nums.begin(), nums.end());
        int n=nums.size(),currdiff=nums[n-1]-nums[0],left=nums[0]+k,right=nums[n-1]-k;
        for (int i=0;i<n-1;i++){
            int maxi=max(nums[i]+k,right),mini=min(left,nums[i+1]-k);
            currdiff = min(currdiff, maxi-mini);
        }
        return currdiff;
    }
};