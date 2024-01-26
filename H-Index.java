public class H-Index {
        public int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length, result = 0;
            for(int i=0;i< n - result;i++)
                if(citations[i] != result)
                    result = Math.max(result, Math.min(citations[i],n-i));
            return result;
        }
}
