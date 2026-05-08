class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i]) != true) {
                res.put(nums[i], 1);
            }else{
                return true;
            }

        }
        return false;
    }
}