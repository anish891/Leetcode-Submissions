import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequenceUsingDP {
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        //set.size()
        int arr2[] = new int[set.size()];   //sorted unique elements
        int i=0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2);  //ascending
        return lcsForlis(nums, arr2);
    }
    public static int lcsForlis(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int ans = 0;
        //initialize
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
}
