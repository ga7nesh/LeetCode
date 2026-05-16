class Solution {
    List<List<Integer>> res;
    List<Integer> val;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        val = new ArrayList<>();

        Arrays.sort(candidates);

        backTrack(0, candidates, target);

        return res;
    }

    private void backTrack(int start, int[] nums, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(val));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;

            val.add(nums[i]);
            backTrack(i + 1, nums, target - nums[i]);
            val.remove(val.size() - 1);
        }
    }
}