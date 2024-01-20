public class SumOfSubarrayMinimums {
        static int mod =(int) 1e9 +7;
        public int sumSubarrayMins(int[] arr) {
            int len = arr.length + 1;
            int[] left = new int[len];
            int[] ext = new int[len];
            int[] sums = new int[len];
            for(int i = 0; i < len -1; ++i)
               ext[i+1] = arr[i];
            int res = 0;
            for (int i = 1; i < len; i++) {
                int cur = ext[i];
                int l = i - 1;
                while (ext[l] >= cur) 
                    l = left[l];
                left[i] = l;
                sums[i] = sums[l] + cur * (i - l);
                res = (res + sums[i]) % mod;
            }
            return res; 
        }
}
