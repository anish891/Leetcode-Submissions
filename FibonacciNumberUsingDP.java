import java.util.Arrays;

public class FibonacciNumberUsingDP {
    public int fib(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fibHelper(n, dp);
    }
    private int fibHelper(int n, int[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fibHelper(n - 1, dp) + fibHelper(n - 2, dp);
        return dp[n];
    }
}
