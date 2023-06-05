public class RemoveNthNodefromLL {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // calculate size of LinkedList
            int size = 0;
            ListNode temp = head;
            while(temp != null){  // for calculating size
                temp = temp.next;
                size++;
            }
            if(n == size){
                head = head.next; // remove first
                return head;
            }
            // size - n
            int index = 1;
            ListNode prev = head;
            while(index < size-n){
                prev = prev.next;
                index++;
            }
            prev.next = prev.next.next;
            return head;
        }
}
