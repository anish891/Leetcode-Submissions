public class CoinChange2(2D-Array) {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];

        // iniialize - sum is 0
        //i -> coins; j -> sum/change
        for(int i=0;i<n+1;i++){  // initialize 0th column - sum is 0
            dp[i][0] = 1;
        }

        for(int j=1;j<amount+1;j++){  // initialize 0th row
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1] <= j){   // valid
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                } else {               // invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
