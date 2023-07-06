public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int currSum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int end = 0; end<nums.length; end++) {
            currSum += nums[end];
            while(currSum >= target) {
                minLength = Math.min(minLength, (end-start) + 1);
                currSum -= nums[start];
                start++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        else return minLength;
    }
}
