import java.util.PriorityQueue;

public class SlidingWindowMaximum_UsingPriorityQueue {
    static class Pair implements Comparable<Pair>{
            int val;
            int index;

            public Pair(int val, int index){
                this.val = val;
                this.index = index;
            }

            @Override
            public int compareTo(Pair p2) {
                // ascending
                // return this.val -p2.val;
                // descending
                return p2.val - this.val;
            }
        }
    public int[] maxSlidingWindow(int[] arr, int k) {
        int result[] = new int [arr.length-k+1];   // n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for(int i = 0; i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().val;

        for(int i = k;i<arr.length;i++){
            while(pq.size() > 0 && pq.peek().index <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            result[i-k+1] = pq.peek().val;
        }
        return result;
    }
}
