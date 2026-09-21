// ==========================================================
// 61. Rotate List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.3 MB (Beats 63%)
// Link       : https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next == null) return head;
         ListNode t = head;
         int count = 0;
         while (t!=null) {
            count++;
            t = t.next;
         }
        
         int b = 0;
        k = k%count;
        if (k==0) return head;
         head = reverse(head,count);
         ListNode a = head;
         while (b!=k) {
            b++;
            a = a.next;
         }
         head = reverse(head,k);

        ListNode c = head;
        while (c.next !=null) {
            c = c.next;
        }
        c.next = a;
        b = 0;
        ListNode temp = head;
        while (b!=k-1) {
            b++;
            temp = temp.next;
        }
        ListNode start = temp.next;
        temp.next = reverse(start,count-k);

         return head;
    }
    public ListNode reverse(ListNode head,int count) {
        ListNode prev = null;
        ListNode temp = head;
        ListNode tempo = null;
        int a = 0;
        while (a!=count) {
            a++;
            tempo = temp.next;
            temp.next = prev;
            prev = temp;
            temp = tempo;
        }
        head = prev;
        return head;
    }
}