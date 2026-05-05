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
        ListNode tail = head;
        int length = 1, val = 0;

        if (head == null || head.next == null || k == 0) return head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        k = k % length;
        val = length - k - 1;

        while (val-- > 0) {
            head = head.next;
        }
        ListNode newHead = head.next; 
        head.next = null; 
        return newHead;

    }
}