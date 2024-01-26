/* 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * Ekta Agrawal
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dList = new ListNode(0);
        ListNode current = dList;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry = carry + l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(carry%10);
            carry = carry/10;
            current = current.next;
        }
        return dList.next;
    }
}
