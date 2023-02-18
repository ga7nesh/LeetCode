class Solution {
public:
    string addBinary(string a, string b) {
        if(a.size() < b.size())
            swap(a, b);
        int m = b.size();
        int n = a.size();
        string out = "";
        int j = n-1;
        bool carry = false;
        for(int i=m-1;i>=0;i--,j--) {
            if(b[i] == '1' and a[j] == '1') {
                if(carry) {
                    out = "1" + out;
                }
                else {
                    carry = true;
                    out = "0" + out;
                }
            }
            else if (b[i] == '0' and a[j] == '0'){
                if(carry) {
                    out = "1" + out;
                    carry = false;
                }
                else {
                    out = "0" + out;
                }
            }
            else {
                if(carry) {
                    out = "0" + out;
                }
                else {
                    out = "1" + out;
                }
            }
        }
        for(int i=j;i>=0;i--) {
            if(a[i] == '1') {
                if(carry)
                    out = "0" + out;
                else
                    out = "1" + out;
            }
            else {
                if(carry) {
                    out = "1" + out;
                    carry = false;
                }
                else
                    out = "0" + out;
            }
        }
        if(carry) 
            out = "1" + out;
        return out;
    }
};