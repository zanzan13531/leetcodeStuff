// time: O(n)
// space: O(n)


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return (result);
        }
        result.add(new ArrayList<Integer>());
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        Queue<Integer> levels = new LinkedList<Integer>();
        nodes.add(root);
        levels.add(0);
        while (!nodes.isEmpty()) {
            TreeNode temp = nodes.poll();
            int level = levels.poll();
            if (level >= result.size()) {
                result.add(new ArrayList<Integer>());                
            }
            result.get(level).add(temp.val);
            if (temp.left != null) {
                nodes.add(temp.left);
                levels.add(level + 1);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
                levels.add(level + 1);
            }
        }
        return (result);
    }
}