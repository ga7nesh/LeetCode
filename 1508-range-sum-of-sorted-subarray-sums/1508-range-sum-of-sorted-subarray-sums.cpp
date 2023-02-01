class Solution {
public:
    const int mod=1e9+7;
    int rangeSum(vector<int>& nums, int n, int left, int right) {
        vector<long long int>v;
        for(int i=0;i<nums.size();i++)
        {
            long long int sum=nums[i];
            v.push_back(sum);
            for(int j=i+1;j<nums.size();j++)
            {
                sum+=nums[j];
                v.push_back(sum);
            }
        }
        long long int ans=0;
        sort(v.begin(),v.end());
        for(int i=left-1;i<right;i++)
        {
            ans=((ans%mod)+(v[i]%mod))%mod;
        }
        return ans%mod;
    }
};