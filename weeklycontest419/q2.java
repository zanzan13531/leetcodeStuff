/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    ArrayList<Integer> binTreeSizes;

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        binTreeSizes = new ArrayList<Integer>();
        probePerfectTrees(root);
        if (k > binTreeSizes.size()) {
            return -1;
        }
        Collections.sort(binTreeSizes);
        Collections.reverse(binTreeSizes);
        // for (int i = 0; i < binTreeSizes.size(); i++) {
        // System.out.println(binTreeSizes.get(i));
        // }
        return binTreeSizes.get(k - 1);
    }

    public int probePerfectTrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            binTreeSizes.add(1);
            return 1;
        }
        if (root.left == null || root.right == null) { // only one side is perfect
            probePerfectTrees(root.left);
            probePerfectTrees(root.right);
            return -1;
        }
        int l = probePerfectTrees(root.left);
        int r = probePerfectTrees(root.right);
        if (l >= 0 && r >= 0 && l == r) {
            binTreeSizes.add(l + r + 1);
            return l + r + 1;
        } else {
            return -1;
        }
    }
}