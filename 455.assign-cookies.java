import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
         int i = 0;
        int count=0;
         for(int j=0;i<g.length && j<s.length;j++) {
    	  if(g[i]<=s[j]) {
              count++;
              i++;
          }
    }
          return count;
    }
}
// @lc code=end

