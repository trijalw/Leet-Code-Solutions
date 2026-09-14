// ==========================================================
// 19. Remove Nth Node From End of List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.4 MB (Beats 77%)
// Link       : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        if (count==n) {
            head = head.next;
        }
        else if (count==1 && n==1) {
            return null;
        }
        else if (count>1 && n!=1) {
            int a = count - n;
            ListNode t = head;
            int c = 0;
            while (t!=null) {
                c++;
                if (c==a) {
                    t.next = t.next.next;
                }
                else { 
                t = t.next;
                }
            }
            return head;
        }
        else if (count>1) {
            ListNode a = head;
            while (a.next.next!=null) {
                a = a.next;
            }
            a.next = null;
            return head;
        }
        return head;
    }
}