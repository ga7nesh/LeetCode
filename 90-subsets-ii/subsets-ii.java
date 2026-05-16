class Solution {
    List<List<Integer>> res;
    List<Integer> subset;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        subset = new ArrayList<>();

        Arrays.sort(nums);

        backTrack(0, nums);
        return res;
    }

    private void backTrack(int start, int[] nums) {
        res.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;

            subset.add(nums[i]);
            backTrack(i + 1, nums);
            subset.remove(subset.size() - 1);
        }
    }
}