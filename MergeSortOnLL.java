public class MergeSortOnLL {
        public ListNode sortList(ListNode head) {
          return sortList(head, null);
        }
    
        ListNode sortList(ListNode p, ListNode q) {
            if (p == null || p == q) {
                return p;
            }
            boolean sorted = true;
            ListNode curr = p;
            while (curr.next != null && curr != q) {
                if (curr.val > curr.next.val) {
                    sorted = false;
                    break;
                }
                curr = curr.next;
            }
            if (sorted) {
                return p;
            }
            ListNode pre = p;
            ListNode head = p;
            curr = pre.next;
            while (curr != null && curr != q) {
                ListNode next = curr.next;
                if (curr.val < p.val) {
                    pre.next = next;
                    curr.next = head;
                    head = curr;
                } else {
                    pre = curr;
                }
                curr = next;
            }
            p.next = sortList(p.next, q);
            return sortList(head, p);  
        }
}
