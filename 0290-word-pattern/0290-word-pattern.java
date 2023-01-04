class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
        if(pattern.length()!=a.length)
            return false;
            HashMap<Character,String>map1=new HashMap<>();                                 HashMap<String,Character>map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            map1.put(pattern.charAt(i),a[i]);
            map2.put(a[i],pattern.charAt(i));
        }
        for(int i=0;i<pattern.length();i++){
            if(map1.get(pattern.charAt(i)).equals(a[i]) && map2.get(a[i])==(pattern.charAt(i)))
                continue;
            return false;
        }
      return true;
    }
}