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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        Stack<TreeNode>s=new Stack();
        s.push(root);
        while(s.isEmpty()!=true){
            TreeNode currNode = s.pop();
            if(currNode!=null){
                a.add(currNode.val);
                s.push(currNode.right);
                s.push(currNode.left);
            }
        }
        return a;
    }
}