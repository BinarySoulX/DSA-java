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
    private static void compute(TreeNode root,StringBuilder path,List<String> list){
        if(root == null){return;}

        int len=path.length();
        if(len>0){path.append("->");}
        path.append(root.val);
        
        if(root.left==null && root.right==null){list.add(path.toString());}
        else{compute(root.left,path,list);compute(root.right,path,list);}
        path.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){return new ArrayList<String>();}
        List<String> list=new ArrayList<>();
        compute(root,new StringBuilder(),list);
        return list;
    }
}