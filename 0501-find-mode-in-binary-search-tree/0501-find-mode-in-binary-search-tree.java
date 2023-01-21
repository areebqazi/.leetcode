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
    HashMap<Integer,Integer>map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        int no=0, large=0;
        ArrayList<Integer>a=new ArrayList<>();
        find(root);
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(m.getValue()>large){
                large=m.getValue();
            }
        }
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(m.getValue()==large)
                a.add(m.getKey());
        }
        int arr[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
            arr[i]=a.get(i);
        return arr;
    }
    void find(TreeNode root){
        if(root==null)
            return ;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        find(root.left);
        find(root.right);
    }
}