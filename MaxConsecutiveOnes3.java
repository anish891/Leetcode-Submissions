public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        while(right<nums.length){
            if(nums[right] == 0){
                count++;
            }
            right++;
            if(count>k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
        }
        return right-left;
    }
}
