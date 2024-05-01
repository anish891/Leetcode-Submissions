public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3) {
            return false;  // If the array is null or has less than 3 elements, it's not possible to find an increasing triplet
        }
        int a = Integer.MAX_VALUE;  // Initialize 'a' to the maximum possible integer value
        int b = Integer.MAX_VALUE;  // Initialize 'b' to the maximum possible integer value
        // Iterate through each element of the array
        for(int n : nums) {
            if(n <= a) {
                a = n;  // Update 'a' if the current element is less than or equal to 'a'
            } else if(n <= b) {
                b = n;  // Update 'b' if the current element is greater than 'a' but less than or equal to 'b'
            } else {
                return true;  // If we find an element greater than both 'a' and 'b', we have found an increasing triplet
            }
        }  
        return false;  // If no increasing triplet is found after iterating through the array, return false
   }
}
