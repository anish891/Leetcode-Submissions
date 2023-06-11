public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
       if(head == null || head.next == null) {
            return head;
        }
        ListNode h1 = head, h2 = head.next;
        ListNode evenList = h2;
        while(h1 != null && h2 != null && h2.next != null) {
            h1.next = h2.next;
            h2.next = h1.next.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        h1.next = evenList;
        return head; 
    }
}
