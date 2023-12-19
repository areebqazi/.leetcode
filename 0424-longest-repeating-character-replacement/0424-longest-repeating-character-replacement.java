class Solution {
    public int characterReplacement(String s, int k) {
        int count[]=new int[26];
        int max =0;
        int left = 0 ;
        for(int right=0;right<s.length();right++){
            count[s.charAt(right)-65]++;
            int maxF=0;
            for(int i:count) maxF = Math.max(maxF,i);
            if((right-left+1)-maxF<=k){
                max= Math.max(max, (right-left+1));
            }else{
                count[s.charAt(left)-65]--;
                left++;
            }
        }
        return max;
    }
}