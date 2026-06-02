class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int j = n - 1, res = 0;
        while (j>=0 && s.charAt(j) != ' ') {
            res++;
            j--;
        }
        return res;
    }
}