import java.util.Arrays;

public class DivideArraysIntoArraysIntoArraysWIthMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int numOfArrays = (int)Math.ceil(n/3);
        
        int ans[][] = new int[numOfArrays][3];

        for(int i=0, j=0; i < n; i+= 3, j++){
            if(i+2 < n && nums[i+2] - nums[i] <= k)
                ans[j] = new int []{nums[i+2], nums[i+1], nums[i]};
            else
                return new int[0][0];
        }
        return ans;
    }
}
