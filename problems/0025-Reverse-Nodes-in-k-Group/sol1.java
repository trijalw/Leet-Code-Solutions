// ==========================================================
// 25. Reverse Nodes in k-Group
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 34%)
// Memory     : 46.7 MB (Beats 17%)
// Link       : https://leetcode.com/problems/reverse-nodes-in-k-group/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int count = 0;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        ListNode h = head;
        if (count<k) return head;
        if (k==1) return head;
        // we need count%k
        int window = count/k;
        ListNode tempo = head;
        while (window>0 && tempo!=null) {
                ListNode n = null;
                ListNode prev = null;
                int c =0;
                h = tempo;
                while (c<k && tempo!=null) {
                    c++;
                    n = tempo.next;
                    tempo.next = prev;
                    prev = tempo;
                    tempo = n;
                }
                curr.next = prev; 
                h.next = tempo;
                curr = h; 
                window--;
            }

        return dummy.next;
        }
        
    }