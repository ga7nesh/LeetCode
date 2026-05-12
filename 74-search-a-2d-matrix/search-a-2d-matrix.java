class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i=0,j=n-1;

        while(i<=j){
            int mid = (i+j)/2;
            int x=0,y=m-1;

            if(matrix[mid][0]<=target && target<=matrix[mid][m-1]){
                while(x<=y){
                    int midSet = (x+y)/2;

                    if(matrix[mid][midSet] == target){
                        return true;
                    }else if(matrix[mid][midSet]<target){
                        x = midSet+1;
                    }else{
                        y= midSet-1;
                    }
                }
                return false;

            }
            else if(target<matrix[mid][0]){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return false;
    }
}