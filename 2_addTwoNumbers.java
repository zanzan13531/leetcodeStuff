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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode fNode = new ListNode();
        ListNode cNode = fNode;
        int carry = 0;
        if (n1.val + n2.val >= 10) {
            cNode.val = n1.val + n2.val - 10;
            carry = 1;
        } else {
            cNode.val = n1.val + n2.val;
            carry = 0;
        }
        while (n1.next != null || n2.next != null) {
            cNode.next = new ListNode();
            cNode = cNode.next;
            if (n1.next != null && n2.next != null) {
                n1 = n1.next;
                n2 = n2.next;
                if (n1.val + n2.val + carry >= 10) {
                    cNode.val = n1.val + n2.val + carry - 10;
                    carry = 1;
                } else {
                    cNode.val = n1.val + n2.val + carry;
                    carry = 0;
                }
            } else if (n1.next != null) {
                n1 = n1.next;
                if (n1.val + carry >= 10) {
                    cNode.val = n1.val + carry - 10;
                    carry = 1;
                } else {
                    cNode.val = n1.val + carry;
                    carry = 0;
                }
            } else { //if (n2.next != null)
                n2 = n2.next;
                if (n2.val + carry >= 10) {
                    cNode.val = n2.val + carry - 10;
                    carry = 1;
                } else {
                    cNode.val = n2.val + carry;
                    carry = 0;
                }
            }
            
        }
        
        if (carry == 1) {
            cNode.next = new ListNode();
            cNode.next.val = 1;
        }
        
        return (fNode);
    }
}