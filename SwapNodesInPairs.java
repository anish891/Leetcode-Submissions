public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
         if(head == null || head.next == null)
     return head;
 ListNode newHead = head.next;
 ListNode prev = null;
 ListNode first = head;
 ListNode second = first.next;
 while(second != null) {
     
     // Swapping the Pairs by Changing the Links
     first.next = second.next;
     second.next = first;
     if(prev != null)
         prev.next = second;
     
     // If there is NO 2nd Node in the Pair, i.e., Odd no. of Nodes in LL
     if(first.next == null)
         break;
     
     second = first.next.next;
     prev = first;
     first = first.next;
 }
 
 return newHead;
    }
}
