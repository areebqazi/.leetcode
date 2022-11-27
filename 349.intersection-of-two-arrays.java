import java.util.ArrayList;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>a=new ArrayList<>();
       ArrayList<Integer>b=new ArrayList<>();
       ArrayList<Integer>c=new ArrayList<>();
        for(int i:nums1){
            if(!a.contains(i))
                a.add(i);
        }
        for(int j:nums2){
            if(!b.contains(j))
                b.add(j);
        }
        for(int i=0;i<a.size();i++){
            if(b.contains(a.get(i)))
                c.add(a.get(i));
        }
        int n[]=new int[c.size()];
        for(int i=0;i<c.size();i++)
            n[i]=c.get(i);
        return n;
    }
}
// @lc code=end

