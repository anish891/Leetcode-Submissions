public class DailyTemperatures {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int hottest = 0;
            int ans[] = new int [n];
            for(int i=n-1;i>=0;i--){
                int currTemp = temperatures[i];
                if(currTemp >= hottest){
                    hottest = currTemp;
                    continue;
                } 
                int day = 1;
                while (temperatures[i + day] <= currTemp) {
                    day += ans[i + day];
                }
                ans[i] = day;
            }
            return ans;
            }
}
