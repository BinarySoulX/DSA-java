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
    private int count = 0;
    private int[] solve(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = solve(root.left);
        int[] right = solve(root.right);

        int sum = left[0] + right[0] + root.val;
        int nodeCount = left[1] + right[1] + 1;

        if (sum / nodeCount == root.val) {
            count++;
        }

        return new int[]{sum, nodeCount};
    }

    public int averageOfSubtree(TreeNode root) {
        count = 0;
        solve(root);
        return count;
    }
}