// ==========================================================
// 1669. Merge In Between Linked Lists
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 5%)
// Memory     : 49.2 MB (Beats 85%)
// Link       : https://leetcode.com/problems/merge-in-between-linked-lists/
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode dummy = new ListNode();
        ListNode d2 = new ListNode();
        ListNode c2 = d2;
        ListNode curr = dummy;
        int count = 0;
        while (count<b && temp!=null) {
            ListNode next = temp.next;
            count++;
            if (count<=a) {
                curr.next = temp;
                curr = curr.next;
            }
            temp = null;
            temp = next;
        }
        while (list2!=null) {
            ListNode next = list2.next;
            c2.next = list2;
            c2 = c2.next;
            list2 = null;
            list2 = next;
        }
        c2.next = temp.next;
        curr.next  = d2.next;
        return dummy.next;
    }
}