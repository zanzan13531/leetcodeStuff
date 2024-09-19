// time: O(n) based on number of nodes in tree
// space: O(n) or O(h) depending on height of tree

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return (0);
        }
        return (Math.max(maxDepth(root.left, 1), maxDepth(root.right, 1)));
    }
    
    public int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return (depth);
        }
        return (Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1)));
    }
}