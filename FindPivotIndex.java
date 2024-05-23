public class FindPivotIndex {
        public int pivotIndex(int[] nums) {
            int n = nums.length;
            int prefix = 0;
            int suffix  = 0;
            int j = 0;
            for(int i=1;i<n;i++){
                suffix += nums[i];          
            }
            if(suffix == prefix) return 0;
    
            while(j < n-1){
                prefix += nums[j];
                j++;
                suffix -= nums[j];
                if(prefix == suffix) return j;
            }
            return -1;
        }
} 