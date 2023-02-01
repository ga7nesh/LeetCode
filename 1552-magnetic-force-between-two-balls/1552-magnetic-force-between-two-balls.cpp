class Solution {
public:
bool isPossible(vector<int>&position , int gap , int m)
{   
//    initially we place first ball at index 0 and initialise its count 1
    int present = position[0];
    int count =1;
    

    for(int i=0;i<position.size();i++)
    {  
        // check if difference of  new position of ball and present position is greater i.e the 
        // gap is minimum then we increment the count as we place a next ball   
        if(position[i]-present>=gap)
        {
            count++;
            // Now check if we are able to place all the ball then return true  
            if(count==m)
            {
                return true;
            }
            // change the present to the  position of the upper placed ball and make it the present
            // present ball 
            present= position[i];
        } 
    }

    return false;
}
    int maxDistance(vector<int>& position, int m) {
        
        sort(position.begin(),position.end());
       int n= position.size()-1;
    //   our search space is from 0 to the largest position 
       int start = 0;
       int end = position[n];

    //    initially initialise ans with 0
       int ans =0;

      while(start<=end)
      { 
        //   we calculate mid and assume it is the minimum gap between the two balls 
          int mid = start + (end -start)/2;
         
        //  now check if really mid is our min gap then we store mid as ans and change our 
        // search space between mid+1 and the largest element as we want to maximize our ans
          if(isPossible(position ,mid ,m)){
              ans = mid;
              start = mid + 1;
          }
        //   if our assumption is wrong that is mid is not the minimum ans we check for search space
        // from start to mid -1
          else{
              end = mid - 1;
          }
      }

    //   and finally return the ans as it is the maximum of the min. distance between any two ball
       return ans;
    }
};