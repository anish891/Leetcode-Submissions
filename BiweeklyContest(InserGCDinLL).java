class Solution {
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);

            ListNode newNode = new ListNode(gcdValue);
            newNode.next = current.next;
            current.next = newNode;

            current = current.next.next;
        }

        return head;
    }
     public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
}
    }
