// ==========================================================
// 160. Intersection of Two Linked Lists
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 52.5 MB (Beats 93%)
// Link       : https://leetcode.com/problems/intersection-of-two-linked-lists/
// ==========================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int count = 0;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        int c2 = 0;
        ListNode temp2 = headB;
        while (temp2!=null) {
            c2++;
            temp2 = temp2.next;
        }
        while (count>c2) {
            count--;
            headA = headA.next;
        }   
        while (c2>count) {
            c2--;
            headB = headB.next;
        }
        while (headA!=headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}