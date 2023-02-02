/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)     {
        if(search(root.left,p) && search(root.left,q))
           return lowestCommonAncestor(root.left,p,q);
        if(search(root.right,p) && search(root.right,q))
           return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    boolean search(TreeNode root , TreeNode a){
        if(root==null)
            return false;
        if(root==a)
            return true;
        return (search(root.left,a) || search(root.right,a));
    }
}