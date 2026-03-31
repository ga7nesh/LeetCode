class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
                else if(j==needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}