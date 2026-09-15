// ==========================================================
// 328. Odd Even Linked List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 7%)
// Memory     : 46.5 MB (Beats 18%)
// Link       : https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode d2 = new ListNode(-1);
        ListNode c2 = d2;
        ListNode temp = head;
        int count = 0;
        while (temp!=null) {
            count++;
            ListNode next = temp.next;
            if (count%2!=0) {
                curr.next = temp;
                curr = curr.next;
            }
            else {
                c2.next = temp;
                c2 = c2.next;
            }
            temp.next = null;
            temp = next;
        }

        curr.next = d2.next;
        return dummy.next;
    }
}