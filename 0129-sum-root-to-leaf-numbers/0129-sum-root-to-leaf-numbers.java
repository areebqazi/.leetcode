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
    public int sumNumbers(TreeNode root) {
        int result=0;
        List<Integer>list = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
        search(root,list,ans);
        int sum=0;
        for(int i:ans) sum+=i;
        return sum;
    }
    public void search(TreeNode root, List<Integer>list,List<Integer>ans){
        if (root == null) {
            return;
        }
        list.add(root.val);

        if (root.left == null && root.right == null) {
            int no = 0;
            for (int i : list) {
                no = no * 10 + i;
            }
            ans.add(no);
        }

        search(root.left, list, ans);
        search(root.right, list, ans);

        list.remove(list.size() - 1);
        
    }
}