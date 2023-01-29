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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,List<pair>>map=new TreeMap<>();
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(0,0,root));
        while(!q.isEmpty()){
            pair p=q.remove();
            List<pair>list = map.getOrDefault(p.vertical,new ArrayList());
            list.add(p);
            map.put(p.vertical,list);
            
            if(p.node.left!=null)
                q.add(new pair(p.vertical-1,p.level+1,p.node.left));
            
            if(p.node.right!=null)
                q.add(new pair(p.vertical+1,p.level+1,p.node.right));
        }
        
        ArrayList<List<Integer>>a=new ArrayList<>();
        for(Map.Entry<Integer,List<pair>>m:map.entrySet()){
            List<pair>temp=m.getValue();
            Collections.sort(temp,new NodeComparator());
            List<Integer>b= new ArrayList<>();
            for(int i=0;i<temp.size();i++)
                b.add(temp.get(i).node.val);
            a.add(b);
        }
        
        return a;
    }
    
    public class NodeComparator implements Comparator<pair>{
             public int compare(pair p1,pair p2){
                 if(p1.level < p2.level) return -1;
                 else if(p1.level > p2.level) return 1;
                 else return p1.node.val-p2.node.val;
             }
    }
    
    static class pair{
        int vertical;
        int level;
        TreeNode node;
        pair(int a,int b,TreeNode c){
            vertical=a;
            level=b;
            node=c;
        }
    }
}