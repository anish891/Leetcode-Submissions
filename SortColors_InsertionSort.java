public class SortColors_InsertionSort {
        public void sortColors(int[] nums) {
            for(int i=1;i<nums.length;i++){
                int curr = nums[i];
                int prev = i-1;
                // finding out correct position to insert
                while(prev>=0 && nums[prev] > curr){
                    nums[prev+1] = nums[prev];
                    prev--;
                }
                // insertion
                nums[prev+1] = curr;
            }
        }
    }

