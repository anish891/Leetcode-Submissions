public class HammingDistance {
        public int hammingDistance(int x, int y) {
            // 1st approach
            x=x^y;
           int count=0;
           while(x!=0)
           {
                if((x&1)==1)count++;
                x=x>>1;
           }
           return count;

           // 2nd approach
           return Integer.bitCount(x^y);
        }
}
