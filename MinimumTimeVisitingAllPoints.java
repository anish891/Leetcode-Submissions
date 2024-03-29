public class MinimumTimeVisitingAllPoints {
        public int minTimeToVisitAllPoints(int[][] points) {
            int result = 0;
            
            for (int i = 0; i < points.length-1; i++) {
                int x = points[i][0];
                int y = points[i][1];
                
                int a = points[i+1][0];
                int b = points[i+1][1];
                
                result += Math.max(Math.abs(a - x), Math.abs(b - y));
            }
            
            return result;
        }
}
