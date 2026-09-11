// ==========================================================
// 92. Reverse Linked List II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.1 MB (Beats 29%)
// Link       : https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before = head;
        int count = 1;
        if (left==right) return head;
        if (left==1) {
            int length = right-left+1;
            ListNode temp = head;
            ListNode prev = null;
            ListNode tempo = null;
            while (temp!=null && length>0) {
                tempo = temp.next;
                temp.next = prev;
                prev = temp;
                temp = tempo;
                length--;
            }
            head.next = temp;
            return prev;
        }
        while (count<left-1) {
            count++;
            before = before.next;
        }
        int length = right - left +1;
        ListNode temp = before.next;
        ListNode start = temp;
        ListNode tempo = null;
        ListNode prev = null;
        while (start!=null && length>0) {
            tempo = start.next;
            start.next = prev;
            prev = start;
            start = tempo;
            length--;
        }
        temp.next = start;
        before.next = prev;
        return head;
    }
}