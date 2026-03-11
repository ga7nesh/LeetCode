class Solution {
    public boolean isPalindrome(int x) {
        String val = Integer.toString(x);
        StringBuilder sb = new StringBuilder(val);
        sb.reverse();

        if(val.equals(sb.toString())){
            return true;
        }
        return false;
    }
}