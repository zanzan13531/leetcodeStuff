// time: O(n)
// space: O(n)


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
        if (head.next == null) {
            return (null);
        }
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }
        if (nodes.size() == n) {
            return (head.next);
        }
        nodes.get(nodes.size() - n - 1).next = nodes.get(nodes.size() - n).next;
        return (head);
    }
}