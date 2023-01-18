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
    public List<Integer> postorderTraversal(TreeNode root) {
        inOrder(root,a);
        return a;
    }
    public void inOrder(TreeNode root,ArrayList<Integer>a){
        if(root==null)
            return ;
        inOrder(root.left,a);
        inOrder(root.right,a); 
        a.add(root.val);
    }
}