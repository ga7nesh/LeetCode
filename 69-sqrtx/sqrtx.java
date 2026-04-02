class Solution {
    public int mySqrt(int x) {
        int res = 0;
         if(x==0 || x==1){
                return x;
            }
        for(int i=1;i<=x;i++){
           
            if(i <= x / i){
                res = i;
            }
            else{break;}
        }
        return res;
    }
}