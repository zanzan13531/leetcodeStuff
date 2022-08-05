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
    public ListNode detectCycle(ListNode head) {
        
        if (head == null) {
            return (null);
        }
        
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        
        ListNode current = head;
    
        while ((nodes.indexOf(current) == -1) && (current.next != null)) {
            nodes.add(current);
            current = current.next;
        }
        
        if (nodes.indexOf(current) != -1) {
            return (current);
        } else {
            return (null);
        }
    } 
}