public class PowerOfFour {
        public boolean isPowerOfFour(int n) {
            return  (n & (n - 1)) == 0 && n % 3 == 1;
        }
}
