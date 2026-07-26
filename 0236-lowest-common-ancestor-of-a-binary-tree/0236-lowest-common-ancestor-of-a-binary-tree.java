/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { //Java caches Integer objects only for values -128 to 127. For values like 9998, 9999 — != compares object references, not values. 

    private static boolean getPath(TreeNode root, TreeNode p,List<Integer> list){
        if(root==null){return false;} //base case
        list.add(root.val);
        if(root.val==p.val){return true;} //edge case

        boolean leftP=getPath(root.left,p,list);
        boolean rightP=getPath(root.right,p,list);
        if(leftP || rightP){return true;}
        list.remove(list.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> path1=new ArrayList<>();
        List<Integer> path2=new ArrayList<>();
        getPath(root,p,path1);
        getPath(root,q,path2);
        
        int i=0;
        for(;i<path1.size()&&i<path2.size();++i){
            if(!path1.get(i).equals(path2.get(i))){break;}
        }TreeNode lca=new TreeNode(path1.get(i-1));
        return lca;
    }
}