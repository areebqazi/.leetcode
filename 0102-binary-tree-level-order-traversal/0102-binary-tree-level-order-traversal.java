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
    public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode>q=new LinkedList<>();
    List<List<Integer>>a=new ArrayList<>();
    if(root==null) return a;
    q.add(root);
        while(!q.isEmpty()){
            List<Integer>b=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr= q.remove();
                b.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            a.add(b);
        }
        return a;
    }
}