public class MaximumValueataGivenIndexinaBoundedArray {
    public int maxValue(int n, int index, int maxSum) {
        long leftT = index; 
        long rightT = n-index-1;
        long low = 1;
        long high = maxSum;
        while(low <= high)
        {
            long mid = low + (high-low)/2;
            long m = mid - 1;
            long lefts = 0;
            long rights = 0;

            if(m >= leftT)
            {
                long notInRange = m-leftT;
                lefts = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            }
            else 
            {
                lefts = m*(m+1)/2+1*(leftT-m);
            }
            if(m>=rightT)
            {
                long notInRange = m-rightT;
                rights = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            }
            else
            {
                rights = m * (m + 1) / 2 + 1 * (rightT - m);
            }

            long sum = rights + lefts + mid;
            if(sum > maxSum) 
            {
                high = mid-1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return (int)high;
    }
}
