class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> val = new HashSet<>();
        int i = 0, j = 0, max = 0;

        while (j < s.length()) {
            if (!val.contains(s.charAt(j))) {
                val.add(s.charAt(j));
                j++;
            } else {
                val.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}