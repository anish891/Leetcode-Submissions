public class NextPermutation {
        public void nextPermutation(int[] nums) {
            // find the decrese from right, swap with miniumn greater on the right, then
            // reserse from +1 pos
            int len = nums.length, idx = 0;
            for (idx = len - 2; idx >= 0; idx--)
                if (nums[idx] < nums[idx + 1])
                    break;
            if (idx == -1) {
                Arrays.sort(nums);
                return;
            }
            int target;
            for (target = idx + 1; target < len; target++)
                if (nums[target] <= nums[idx])
                    break;
            target--;
            // swap
            int tmp = nums[target];
            nums[target] = nums[idx];
            nums[idx] = tmp;
            //System.out.println(Arrays.toString(nums));
            // reverse
            for (int i = 0; i < (len - idx) / 2; i++) {
                int t = nums[idx + 1 + i];
                nums[idx + 1 + i] = nums[len - 1 - i];
                nums[len - 1 - i] = t;
            }
        }
}
