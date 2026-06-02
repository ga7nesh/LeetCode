class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int m = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            m = Math.min(strs[i].length(), m);
        }

        String res = "";

        for (int i = 0; i < m; i++) {
            char c = strs[0].charAt(i);

            for (int k = 0; k < n; k++) {
                if (strs[k].charAt(i) != c) {
                    return res;
                }
            }
            res += c;
        }

        return res;
    }
}