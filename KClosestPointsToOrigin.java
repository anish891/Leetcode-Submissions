import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0; i<points.length; i++){
            int distSq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new int[] {i, distSq});
        }
        //nearest K
        int[][] result = new int[k][];
        while(k > 0){
            result[k-1] = points[pq.poll()[0]];
            k--;
        }
        return result;
    }
}
