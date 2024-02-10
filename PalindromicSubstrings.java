public class PalindromicSubstrings {
        public int countSubstrings(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            boolean[][] dp1 = new boolean[n][n];
            int ans = n;
            for (int i = 0; i < n - 1; i++) {
                dp1[i][i] = true;
                if (arr[i] == arr[i + 1]) {
                    dp1[i][i + 1] = true;
                    ans++;
                };
            }
            dp1[n - 1][n - 1] = true;
    
            for (int j = 2; j < n; j++) {
                for (int i = j - 2; i >= 0; i--) {
                    dp1[i][j] = dp1[i + 1][j - 1] && arr[i] == arr[j];
                    if (dp1[i][j]) {
                        ans++;
                    }
                }
            }
            return ans;
        }
}
