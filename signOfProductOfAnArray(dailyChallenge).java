public class signOfProductOfAnArray {
        public static int signFunc(double x){
            if (x > 0){
                return 1;
            } else{
                return -1;
            }
        }
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
            return signFunc(x);
        }
    }

