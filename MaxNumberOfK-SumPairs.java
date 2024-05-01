public class MaxNumberOfK-SumPairs {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int res = 0;
        Arrays.sort(nums);
        while(left < right){
            int x = nums[left] + nums[right];
            if(x == k){
                res += 1;
                left += 1;
                right -= 1;
            } else if(x > k){
                right -= 1;
            } else {
                left += 1;
            }
        }
        return res;
    }
}
