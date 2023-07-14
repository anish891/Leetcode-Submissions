import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSubsequenceofGivenDifference {
    public int longestSubsequence(int[] arr, int diff) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int val : arr) {
            map.put(val, map.getOrDefault(val - diff, 0) + 1);
            maxLen = Math.max(maxLen, map.get(val));
        }
        return maxLen;
    }
}
