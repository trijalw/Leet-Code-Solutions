// ==========================================================
// 86. Partition List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44 MB (Beats 13%)
// Link       : https://leetcode.com/problems/partition-list/
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode d2 = new ListNode();
        ListNode curr2 = d2;
        ListNode temp = head;
        while (temp!=null) {
            ListNode cycle = temp.next;
            if (temp.val>=x) {
                curr2.next = temp;
                curr2 = curr2.next;
            }
            else{
                curr.next = temp;
                curr = curr.next;
            }
            temp.next = null;
            temp = cycle;
        }
        curr.next = d2.next;
        return dummy.next;
    }
}