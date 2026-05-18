class Solution {
    int res;

    public int countSubstrings(String s) {
        int n = s.length(), left = 0, right = 0;
        res = 0;

        if (n < 0)
            return 0;

        for (int i = 0; i < n; i++) {
            int len1 = checkPalindrome(s, i, i);
            int len2 = checkPalindrome(s, i, i + 1);
        }
        return res;
    }

    private int checkPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            res++;
        }
        return res;
    }
}