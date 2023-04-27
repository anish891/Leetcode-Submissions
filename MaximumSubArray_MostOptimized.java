public class MaximumSubArray_MostOptimized {
    
        public int maxSubArray(int[] nums) {
            int currentSum = nums[0];
            int maxSum = nums[0];
            for(int i=1;i<nums.length;i++){
                currentSum = Math.max(currentSum + nums[i], nums[i]);
            
            if(currentSum > maxSum){
                maxSum =  currentSum;
            }
            }
           return maxSum;
        }
    
}
