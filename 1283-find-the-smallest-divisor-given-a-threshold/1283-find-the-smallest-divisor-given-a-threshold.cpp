class Solution {
public:
    bool fun(vector<int> &nums,int k,int mid){
        int sum =0;
        for(auto it : nums){
            sum += it/mid;
            if(it%mid)
                sum++;
        }
        return sum<=k;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int low = 1;
        int high = 0;
        for(auto it : nums)
            high = max(high,it);
        int ans ;
        while(low<=high){
            int mid  = (low+high)/2;
            if(fun(nums,threshold,mid)){
                ans = mid;
                high = mid-1;
            }else
                low = mid+1;

        }
            return ans;
    }
};