public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return add(l1, l2, 0);
        }
        public ListNode add(ListNode l1, ListNode l2, int carry){
            if(l1 == null && l2 == null){
                return carry>0 ? new ListNode(carry) : null;
            }
            int num = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = 0;
            if(num >9){
                carry = 1;
                num = num-10;
            }
            ListNode newNum = new ListNode(num,add((l1 == null ? l1 : l1.next),(l2 == null ? l2 : l2.next),carry));
            return newNum;
        }
}
