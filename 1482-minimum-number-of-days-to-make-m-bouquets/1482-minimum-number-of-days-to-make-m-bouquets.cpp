class Solution {
public:
    bool fun(vector<int> &arr,int c,int m,int k){
        int count = 0;
        int temp = 0;
        for(int i=0;i<arr.size();i++){
            if(arr[i]<=c){
                if(i!=0 and arr[i-1]>c)
                    temp = 0;
                temp++;
                if(temp==k){
                    count++;
                    temp =0;
                }
            }
        }
        return count>=m;
    }
    int minDays(vector<int>& bloomDay, int m, int k) {
        int low = INT_MAX;
        int high = INT_MIN;
        for(auto it: bloomDay){
            low = min(low,it);
            high = max(high,it);
        }
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(fun(bloomDay,mid,m,k))
            {
                ans = mid;
                high = mid-1;
            }else
                low = mid+1;
        }
        return ans;
    }
};