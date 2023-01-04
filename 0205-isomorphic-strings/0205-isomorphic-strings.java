class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(s.indexOf(c1) != t.indexOf(c2))
                return false;
        }   
        return true;
    }
}