// ==========================================================
// 143. Reorder List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 87%)
// Memory     : 49.5 MB (Beats 14%)
// Link       : https://leetcode.com/problems/reorder-list/
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode s = second;
        ListNode prev = null;
        ListNode tempo = null;
        while (s!=null) {
            tempo = s.next;
            s.next = prev;
            prev = s;
            s = tempo;
        }
        second = prev;
        ListNode temp = head;
        while (temp!=null && second!=null) {
            ListNode next = temp.next;
            ListNode s2 = second.next;
            temp.next = second;
            second.next = next;
            temp = next;
            second = s2;
        }
    }
}