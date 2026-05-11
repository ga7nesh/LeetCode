class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,count=0;
        int n = s.length();
        Set<Character> set = new HashSet<>();

        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            } else{
                set.remove(s.charAt(i));
                i++;
            }
            count = Math.max(count,j-i);
        }
       return count;
    }
}