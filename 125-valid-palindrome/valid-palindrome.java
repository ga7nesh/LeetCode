class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length();

        //if(n<2) return false;
        
        int i=0,j=n-1;
        while(i<j){
            if(s.charAt(i)==(s.charAt(j))){
                i++;j--;
            }
            else{ return false;}
        }
        return true;
    }
}