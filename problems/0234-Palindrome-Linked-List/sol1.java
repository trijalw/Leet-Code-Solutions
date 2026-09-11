// ==========================================================
// 234. Palindrome Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 100%)
// Memory     : 94.4 MB (Beats 67%)
// Link       : https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode tempo = null;
        while (slow!=null) {
            tempo = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tempo;
        }
        slow = prev;
        while (slow!=null) {
            if (temp.val != slow.val) return false;
            temp= temp.next;
            slow =slow.next;
        }
        return true;
    }
}