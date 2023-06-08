public class DeleteMiddleNodeOfLinkedList {
        public ListNode deleteMiddle(ListNode head) {
            if(head.next == null){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;
            while(fast!= null && fast.next != null){
                prev = slow;     // slow ke pehle wala dhundne ke liye
                slow = slow.next;   // +1
                fast = fast.next.next;   // +2
            }
            prev.next = prev.next.next; // middle ke pehle wale ko middle ke next wale ko point karwane ke liye
            return head; 
    
        }
}
