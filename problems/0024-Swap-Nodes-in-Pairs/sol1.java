// ==========================================================
// 24. Swap Nodes in Pairs
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.2 MB (Beats 12%)
// Link       : https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode h = head;
        int count =0;
        while (h!=null) {
            count++;
            h = h.next;
        }
        ListNode a = head;
        if (head==null || count==1) return head;
        int window = count/2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (window>0) {
            a = temp;
            ListNode prev = null;
            ListNode tempo = null;
            int c = 0;
            while (c<2) {
                c++;
                tempo = temp.next;
                temp.next = prev;
                prev = temp;
                temp = tempo;
            }
            curr.next = prev;
            a.next = temp;
            curr = a;
            window--;
        }
        return dummy.next;
    }
}