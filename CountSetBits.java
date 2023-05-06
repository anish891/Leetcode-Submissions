public class CountSetBits {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while(n!=0){
                count += n&1;
                n = n>>>1;  // here >>> is bit shifting unsigned operation
            }
            return count;
        }
}
