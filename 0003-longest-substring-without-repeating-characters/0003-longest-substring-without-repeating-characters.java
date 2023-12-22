class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashSet<Character>set = new HashSet<>();
        int count = 0 ,left = 0 ;
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            if(set.contains(k)){
                while(s.charAt(left)!=k){
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            else{
                set.add(k);
                count=Math.max(count,set.size());
            }
        }
        return count;
    }
}