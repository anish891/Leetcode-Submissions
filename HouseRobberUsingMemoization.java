import java.util.Arrays;

public class HouseRobberUsingMemoization {
    public int memoization(int i,int[] nums,int[] dp){
        if(i<0)
            return 0;
        if(i==0){
            return nums[i];
        }
        if(dp[i]!=-1)
            return dp[i];

        return dp[i]=Math.max(nums[i]+memoization(i-2,nums,dp), memoization(i-1,nums,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return memoization(n-1,nums,dp);
    }
}
