public class XtoThePowerN {
        public double myPow(double x, long n) {
            if(n==0){
                return 1;
            }
            if(n<0){
                n = -n;
                x = 1/x;
            }       
            double ans = myPow(x*x,n/2);
        return (n%2==0) ? ans : x*ans;  
        }
}
