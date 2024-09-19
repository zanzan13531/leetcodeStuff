// time: O(n) i think technically it might be O(nlog(n))? in the case where root = [1,1,1,1,1,1...] and subRoot = [1] it would need to check log(n) nodes, each going n times?
// space: O(n) space of stack


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode head = root;
        if (head != null && head.val != subRoot.val) {
            return (isSubtree(head.left, subRoot) || isSubtree(head.right, subRoot));
        }
        if (head != null) {
            return (isSameTree(head, subRoot) || isSubtree(head.left, subRoot) || isSubtree(head.right, subRoot));
        }
        return (subRoot == null);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return (true);
        } else if (p == null) {
            return (false);
        } else if (q == null) {
            return (false);
        } else {
            return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
    }
}