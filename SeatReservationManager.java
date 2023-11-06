public class SeatReservationManager {
    class SeatManager {
        private int l;
        private PriorityQueue<Integer> pq;
    
        public SeatManager(int n) {
            this.l=0;
            this.pq = new PriorityQueue<>();
        }
        
        public int reserve() {
            if (pq.isEmpty()) {
                return ++l;
            } else {
                return pq.poll();
            }
        }
        
        public void unreserve(int seatNumber) {
            if (seatNumber == l) {
                --l;
            } else {
                pq.offer(seatNumber);
            }
        }
    }
    
    /**
     * Your SeatManager object will be instantiated and called as such:
     * SeatManager obj = new SeatManager(n);
     * int param_1 = obj.reserve();
     * obj.unreserve(seatNumber);
     */
}
