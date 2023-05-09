public class DuplicateNumberUsingBitManipulation {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length+1];
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] += 1;
            if(arr[nums[i]]>1){
                temp =nums[i];
                break;
            }
        }
        return temp;
    }
}
