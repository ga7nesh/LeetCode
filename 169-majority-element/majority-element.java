class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i], val);
                if (val > (n / 2)) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
                if (1 > n / 2) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}