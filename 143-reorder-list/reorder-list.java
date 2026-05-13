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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head, second = slow;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        second = slow.next;
        slow.next = null;

        ListNode curr = second;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;

        }
        ListNode val = head;
        while (head != null && prev != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = prev.next;

            head.next = prev;
            prev.next = temp1;
            head = temp1;
            prev = temp2;
        }
    }
}