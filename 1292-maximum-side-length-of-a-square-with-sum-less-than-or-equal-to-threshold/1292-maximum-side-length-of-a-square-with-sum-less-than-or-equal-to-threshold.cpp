class Solution {
public:
    bool solve(vector<vector<int>>& mat,int side,int th)
    {
        int n = mat.size();
        int m = mat[0].size();
        for(int i=side-1;i<n;i++)
        {
            for(int j=side-1;j<m;j++)
            {
                if(mat[i][j]<=th)
                return true;
                if(j-side>=0 && i-side>=0)
                {
                    int diff = mat[i][j]-(mat[i-side][j]+mat[i][j-side]-mat[i-side][j-side]);
                    if(diff<=th)
                    return true;
                }
                else if(i-side>=0 && j-side<0)
                {
                    int diff = mat[i][j]-mat[i-side][j];
                    if(diff<=th)
                    return true;
                }
                else if(i-side<0 && j-side>=0)
                {
                    int diff = mat[i][j]-mat[i][j-side];
                    if(diff<=th)
                    return true;
                }
            }
        }
        return false;
    }
    int maxSideLength(vector<vector<int>>& mat, int threshold) {
        int n = mat.size();
        int m = mat[0].size();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int j=0;j<m;j++)
        {
            for(int i=1;i<n;i++)
            {
                mat[i][j]+=mat[i-1][j];
            }
        }
        int maxi = min(n,m);
        int l = 1,r = maxi;
        int ans=0;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(solve(mat,mid,threshold))
            {
                ans = mid;
                l = mid+1;
            }
            else
            r = mid-1;
        }
        return ans;
    }
};