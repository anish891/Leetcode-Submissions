public class signOfProductOfAnArray {
    public int arraySign(int[] nums) {
        double x =1;
        int i=0;
        while(i<nums.length){
            if (nums[i] == 0){
                return 0;
            }
            else {
                x *= nums[i];
            }
            i++;
        } 
       if (x > 0){
            return 1;
        } else{
            return -1;
        } 
    }
}
    

