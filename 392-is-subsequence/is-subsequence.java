class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = t.length();

        if(s.length()==0){
            return true;
        }

        while (j < n && n!=0) {
            if (s.charAt(i) == t.charAt(j)) {
                if (i == s.length()-1) {
                    return true;
                }
                i++;
                j++;

            } else {
                j++;
            }
        }
        return false;
    }
}