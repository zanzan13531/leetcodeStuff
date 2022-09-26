// time: O(n) or O(N + K) where K is the length of the cycle
// space: O(1)


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return (false);
        }
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        while (fast.next != null) {
            fast = fast.next;
            if (i % 2 == 1) {
                slow = slow.next;
            }
            if (fast == slow) {
                return (true);
            }
            i++;
        }
        return (false);
    }
}