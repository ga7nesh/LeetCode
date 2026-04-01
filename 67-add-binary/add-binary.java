class Solution {
    public String addBinary(String a, String b) {
        int carry = 0, n = a.length(), m= b.length(), count=0, i=n-1,j=m-1;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j>=0 || carry > 0){
            count = carry;
            
            if(i >= 0){
                count += a.charAt(i) - '0';
            }
             if(j >= 0){
                count += b.charAt(j) - '0';
            }
            carry = count / 2;
            sb.append(count % 2);
            i--;j--;
        }
        return sb.reverse().toString();

    }
}