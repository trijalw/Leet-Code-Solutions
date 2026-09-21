// ==========================================================
// 2. Add Two Numbers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 46.2 MB (Beats 89%)
// Link       : https://leetcode.com/problems/add-two-numbers/
// ==========================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode dummy = new ListNode(-1);
        if (l1==null || l2==null) return dummy.next;
        ListNode curr = dummy;
        while (l1!=null || l2!=null || carry!=0) {
            int a = 0;
            int b = 0;
            if (l1!=null) a = l1.val;
            if (l2!=null) b = l2.val;
            int sum = a + b + carry;
            int digit = sum%10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = curr.next; 
            carry = sum/10;
            if (l1 != null) l1 = l1.next;
            if (l2 !=null)l2 = l2.next;
        }
        return dummy.next;
    }
}