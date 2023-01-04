class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character>map1=new HashMap<>();                    HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(map1.get(s.charAt(i))==t.charAt(i) && map2.get(t.charAt(i))==s.charAt(i))
                continue;
            return false;
        }
        return true;
    }
}
