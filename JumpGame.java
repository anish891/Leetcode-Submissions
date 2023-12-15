public class JumpGame {
        public boolean canJump(int[] nums) {
           int maxReach = 0;
            int n = nums.length;
    
            for (int i = 0; i < n && i<=maxReach; i++) {
                
                maxReach = Math.max(maxReach, i + nums[i]);
                if (maxReach >= n - 1) {
                    return true;
                }
            }
            return false;
        }
}
