public class PutMarblesInBag {
        public long putMarbles(int[] weights, int k) {
            // all partition points
            int[] costs = new int[weights.length - 1];
            for (int i = 0; i < weights.length - 1; i++) {
                costs[i] = weights[i] + weights[i+1];
            }
            Arrays.sort(costs);
            long min = 0, max = 0;
            for (int i = 0; i < k - 1; i++) {
                min += costs[i];
                max += costs[costs.length - 1 - i];
            }
            return max - min;
        }
}
