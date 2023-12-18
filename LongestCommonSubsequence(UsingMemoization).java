public class LongestCommonSubsequence(UsingMemoization) {
        public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return sol(text1,text2,dp);
    }
    public int sol(String s,String t,int[][] dp){
        int m=s.length();
        int n=t.length();
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0 || n==0){
            dp[m][n]=0;
            return dp[m][n];
        }
        if(s.charAt(0)==t.charAt(0)){
            dp[m][n]=1+sol(s.substring(1),t.substring(1),dp);
        }else{
            dp[m][n]=Math.max(sol(s.substring(1),t,dp),sol(s,t.substring(1),dp));
        }
        return dp[m][n];
    }

}
