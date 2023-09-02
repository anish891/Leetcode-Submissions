public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the rest of the elements
     }
     public static void reverse(int[] nums, int start, int end) {
         while(start < end) {
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start ++;
             end --;
         }
     }
}
