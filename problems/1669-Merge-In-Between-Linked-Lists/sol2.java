// ==========================================================
// 1669. Merge In Between Linked Lists
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 100%)
// Memory     : 49.1 MB (Beats 94%)
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

        // Find the node before index a
        ListNode beforeA = list1;
        for (int i = 0; i < a - 1; i++) {
            beforeA = beforeA.next;
        }

        // Find the node after index b
        ListNode afterB = beforeA;
        for (int i = a; i <= b+1; i++) {
            afterB = afterB.next;
        }

        // Find the last node of list2
        ListNode tail2 = list2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        // Connect list1 before a → list2
        beforeA.next = list2;

        // Connect list2 → list1 after b
        tail2.next = afterB;

        return list1;
    }
}