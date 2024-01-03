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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode>a =new ArrayList<>();
        List<TreeNode>b =new ArrayList<>();
        
        TreeNode ans = null;
        int i =0,j=0;
        if(search(root,p,a) && search(root,q,b)){
        while(i<a.size() && j<b.size())
        {
            if(a.get(i)==b.get(i))
                ans= a.get(i);
            i++;
            j++;
        }
        }
        return ans;
    }
    public boolean search(TreeNode root, TreeNode p ,List<TreeNode>list){
        if(root==null)
            return false;
        if(root==p){
            list.add(root);
            return true;
        }
        list.add(root);
        if(search(root.left,p,list) || search(root.right,p,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}