// ==========================================================
// 138. Copy List with Random Pointer
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.7 MB (Beats 100%)
// Link       : https://leetcode.com/problems/copy-list-with-random-pointer/
// ==========================================================

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head==null) return head;
        Node curr = head;
        while (curr!=null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        Node curr2 = head;
        while (curr2!=null) {
            if (curr2.random == null ) {
                curr2.next.random = null;
            }
            else {
            curr2.next.random = curr2.random.next;
            }
            curr2 = curr2.next.next;
        }
        Node newHead = head.next;
        Node c = head;
        Node newCurr = newHead;
        while (c!=null) {
            c.next = newCurr.next;
            c = c.next;
            if (c == null) {
                newCurr.next = null;
            }
            else newCurr.next = c.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}