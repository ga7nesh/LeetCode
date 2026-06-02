class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int start = 0; start <= n - m; start++) {
            int j = 0;
            while (j < m && haystack.charAt(start + j) == needle.charAt(j))
                j++;

            if (j == m)
                return start;
        }
        return -1;
    }
}