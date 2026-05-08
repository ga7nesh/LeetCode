class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Map.Entry<Integer, Integer>[] arr = map.entrySet().toArray(new Map.Entry[0]);

        Arrays.sort(arr, (a, b) -> b.getValue() - a.getValue());

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = arr[i].getKey();
        }
        return res;

    }
}