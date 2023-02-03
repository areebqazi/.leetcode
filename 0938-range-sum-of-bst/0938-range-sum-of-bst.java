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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp.val>=low && temp.val<=high)
                sum+=temp.val;
            if(temp.left!=null)
                q.add(temp.left);
             if(temp.right!=null)
                q.add(temp.right);
        }
        return sum;
    }
}