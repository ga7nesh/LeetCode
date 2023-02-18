class Solution {
public:
    int dfs(int node,int par,vector<int>&informTime,vector<vector<int>>&graph)
    {
        int maxi=0;
        for(auto child:graph[node])
        {
            if(child==par)continue;
            maxi=max(maxi,dfs(child,node,informTime,graph));
        }
        return maxi+informTime[node];
    }
    int numOfMinutes(int n, int headID, vector<int>& manager, vector<int>& informTime) {
        vector<vector<int>>graph(n);
        
        for(int i=0;i<manager.size();i++)
        {
            if(manager[i]==-1)continue;
             graph[i].push_back(manager[i]);
             graph[manager[i]].push_back(i);
        }
        return dfs(headID,-1,informTime,graph);
    }
};