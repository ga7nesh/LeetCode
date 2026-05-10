class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, count=0, res=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.sort(nums);

        if(n==0) return 0;

        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i]-1)){
                count=0;
                map.clear();
                map.put(nums[i],1);
                //System.out.println(nums[i]);
            }
            else if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                System.out.println(nums[i]);
                count++;
                res = Math.max(count,res);
            }
        }
        return res+1;
    }
}