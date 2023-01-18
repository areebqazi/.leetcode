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
        ArrayList<Integer>a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root,a);
        return a;
    }
    public void inOrder(TreeNode root,ArrayList<Integer>a){
        if(root==null)
            return ;
        inOrder(root.left,a);
        a.add(root.val);
        inOrder(root.right,a);
    } 
}