class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int k = 0; k < n; k++) {
            if (k > 0 && nums[k] == nums[k - 1])
                continue;
            i = k + 1;
            j = n - 1;
            int target = -nums[k];

            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum < target) {
                    i++;
                } else if (sum == target) {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1])
                        i++;
                    while (i < j && nums[j] == nums[j + 1])
                        j--;
                } else {
                    j--;
                }
            }
        }
        return res;
    }
}