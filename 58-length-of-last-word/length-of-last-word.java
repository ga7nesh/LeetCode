class Solution {
    public int lengthOfLastWord(String s) {
        int j = s.length()-1;
        int count=0;

        while(j>=0 && s.charAt(j)==' '){
            j--;
        }
        while(j>=0 && s.charAt(j)!=' '){
            count++;
            j--;
        }
        return count;
    }
}