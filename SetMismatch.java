public class SetMismatch {
        public int[] findErrorNums(int[] nums) {
         int ans[] = new int[nums.length+1];
         for(int i:nums){
             ans[i]++;
         }
         int dup=0 , miss=0;
         for(int i=1;i<ans.length;i++){
             if(ans[i]==2){
                 dup=i;
             }
             if(ans[i] ==0){
                 miss=i;
             }
         }
    return new int[]{dup,miss};
        }
}
