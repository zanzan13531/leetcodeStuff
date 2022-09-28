// time: O(n)
// space: O(n)

// didn't really understand this one that well even after looking at the solution


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
    private HashMap<Integer, Integer> indexes;
    int p;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            indexes.put(inorder[i], i);
        }
        
        p = 0;
        TreeNode root = buildTree(preorder, 0, preorder.length - 1);
        return (root);
        
    }
    
    private TreeNode buildTree(int[] preorder, int l, int r) {
        if (l > r) {
            return (null);
        }
        
        int x = preorder[p];
        TreeNode root = new TreeNode(x);
        p++;
        
        root.left = buildTree(preorder, l, indexes.get(x) - 1);
        root.right = buildTree(preorder, indexes.get(x) + 1, r);
        return (root);
        
    }
}