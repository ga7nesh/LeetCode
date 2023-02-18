class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
         int count = 0, prod = 1;
    int left = 0, right = 0;
    while (right < nums.size()) {
        prod *= nums[right];
        while (left <= right && prod >= k) {
            prod /= nums[left];
            left++;
        }
        count += (right - left + 1);
        right++;
    }
    return count;
    }
};