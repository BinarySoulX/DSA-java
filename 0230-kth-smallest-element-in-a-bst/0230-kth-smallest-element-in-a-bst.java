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
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        pq.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        while(pq.size()>k){
            pq.remove();
        }
        return pq.peek();

    }
}