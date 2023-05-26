public class RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
            int k=0,count=1;
            for(int i=0;i<nums.length;i++){
               if(nums[k]!=nums[i]){
                   nums[k+1]=nums[i];
                   k++;
                   count++;
               }
            }
            return count;
        }
}
