// ==========================================================
// 445. Add Two Numbers II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 46 MB (Beats 98%)
// Link       : https://leetcode.com/problems/add-two-numbers-ii/
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
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1!=null || l2!=null || carry!=0) {
            int a = 0;
            int b = 0;
            if (l1!=null) a = l1.val;
            if (l2!=null) b = l2.val;
            int sum = a+b+carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = curr.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        curr = reverse(dummy.next);
        return curr;
    }
    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode tempo = null;
        while (temp!=null) {
            tempo = temp.next;
            temp.next = prev;
            prev = temp;
            temp = tempo;
        }
        head = prev;
        return head;
    }
}