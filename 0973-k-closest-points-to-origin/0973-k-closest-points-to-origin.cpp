class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& arr, int k) {
        // to store distance with index in sorted order
        priority_queue<pair<double,int>> temp;
        
        for(int i=0;i<arr.size();i++){
            temp.push({ sqrt(pow(arr[i][0],2)+pow(arr[i][1],2)) , i});
            
            // if any point's distance is greater than k smallest
            // distances, remove it from priority_queue
            if(temp.size()>k) temp.pop();
        }
        
        vector<vector<int>> ans;

        while(!temp.empty()) {
            ans.push_back(arr[temp.top().second]);
            temp.pop();
        }
        
        return ans;
    }
};