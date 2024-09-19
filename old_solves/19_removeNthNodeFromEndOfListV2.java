// time: O(n)
// space: O(1)


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
        ListNode blank = new ListNode(0, head);
        ListNode first = blank;
        ListNode ahead = blank;
        for (int i = 0; i < n; i++) {
            ahead = ahead.next;
        }
        while (ahead.next != null) {
            first = first.next;
            ahead = ahead.next;
        }
        first.next = first.next.next;
        return (blank.next);
    }
}