class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),t.charAt(i));
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==t.charAt(i)){
                int count=0;
                for(Map.Entry<Character,Character>m:map.entrySet()){
                    if(m.getValue()==t.charAt(i))
                        count++;
                if(count>1)
                    return false;
                }
             }
            else
                return false;
    }
            return true;
}
}