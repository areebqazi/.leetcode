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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        Stack<TreeNode>s=new Stack();
        TreeNode node = root;
       while(node != null || !s.isEmpty()){
           while(node!=null){
               s.push(node);
               node = node.left;
           }
           node = s.pop();
           a.add(node.val);
           node = node.right;
       }
        return  a;
    }
}