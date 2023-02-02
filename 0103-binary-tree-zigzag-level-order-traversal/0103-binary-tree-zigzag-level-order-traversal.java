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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode>q=new LinkedList<>();
    List<List<TreeNode>>a=new ArrayList<>();
    q.add(root);
        while(!q.isEmpty()){
            List<TreeNode>b=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr= q.remove();
                b.add(curr);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            a.add(b);
        }
        for(int i=0;i<a.size();i++){
            List<Integer>temp=new ArrayList<>();
            if(i%2==0){
            for(int j=0;j<a.get(i).size();j++)
            temp.add(a.get(i).get(j).val);
            }
            else{
            for(int j=a.get(i).size()-1;j>=0;j--)
            temp.add(a.get(i).get(j).val);
            }
            ans.add(temp);
        }
        return ans;
    }
}