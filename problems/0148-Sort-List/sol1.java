// ==========================================================
// 148. Sort List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 22 ms (Beats 6%)
// Memory     : 59.1 MB (Beats 87%)
// Link       : https://leetcode.com/problems/sort-list/
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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ListNode t = head;
        int count = 0;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        if (count<2) {
            return head;
        }
        int mid = count/2;
        ListNode left = new ListNode();
        ListNode curr = left;
        int c2 = 0;
        ListNode right = new ListNode();
        ListNode curr2 = right;
        while (t!=null) {
            ListNode next = t.next;
            c2++;
            if (c2<=mid) {
                curr.next = t;
                curr = curr.next;
            }
            else {
                curr2.next = t;
                curr2 = curr2.next;
            }
            t.next = null;
            t = next;
        }
        left = sortList(left.next);
        right = sortList(right.next);
        return merge(left,right);
    }
    public ListNode merge(ListNode left, ListNode right) {
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    while (left!=null && right!=null) {
        ListNode next = left.next;
        ListNode next2 = right.next;
        if (left.val <=right.val) {
            curr.next = left;
            curr = curr.next;
            left.next = null;
            left = next;
        }
        else {
            curr.next = right;
            curr = curr.next;
            right.next = null;
            right = next2;
        }
    }
    while (left!=null) {
        curr.next = left;
        curr = curr.next;
        left = left.next;
    }
    while (right!=null) {
        curr.next = right;
        curr = curr.next;
        right = right.next;
    }
    return dummy.next;
}
}
