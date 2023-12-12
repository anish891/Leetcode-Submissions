public class ClimbingStairsUsingMemoization {
    public int climbStairs(int n) {
        return memoDp(new int [n+1],n);
    }
       int memoDp(int dp[],int n){ 
           if(n==0 || n==1)
              return 1; 
           if (dp[n]!=0)
               return dp[n];
           int step=memoDp(dp,n-1) +memoDp(dp,n-2);
           dp[n]=step;
           return dp[n];
       }
}
