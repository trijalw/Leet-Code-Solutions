// ==========================================================
// 142. Linked List Cycle II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.6 MB (Beats 70%)
// Link       : https://leetcode.com/problems/linked-list-cycle-ii/
// ==========================================================

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean a = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) {
                a = true;
                break;
            }
        }
        if (a) {
            ListNode ptr = head;
            while (ptr!=slow) {
                ptr= ptr.next;
                slow= slow.next;
            }
            return ptr;
        }
        return null;
    }
}