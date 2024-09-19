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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        nodes.add(head);
        head = head.next;
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        int s = nodes.size();
        for (int i = 0; i < s / 2; i++) {
            ListNode cur = nodes.get(i);
            cur.next = nodes.get(s - 1 - i);
            cur = nodes.get(s - 1 - i);
            cur.next = nodes.get(i + 1);
        }
        nodes.get(s / 2).next = null;
        return;
        
    }
}