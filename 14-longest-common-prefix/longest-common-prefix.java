class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strslen = strs.length;
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < strslen; i++) {
            String val = strs[i];
            n = Math.min(n, val.length());
        }

        String fin = "";

        for (int j = 0; j < n; j++) {
            char c = strs[0].charAt(j);

            for (int k = 0; k < strslen; k++) {
                if (strs[k].charAt(j) != c) {
                    return fin;
                }
            }
            fin += c;

        }
        return fin;
    }
}