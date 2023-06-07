public class LinkedListCycle2 {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;  //+1
                fast = fast.next.next;  //+2
                if(slow == fast){
                    slow = head;
                while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
                }
            return slow;
          }
        }
        return null; 
        }
}
