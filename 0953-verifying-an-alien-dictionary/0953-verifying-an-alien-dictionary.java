class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            if(!compare(words[i],words[i+1],order))
                return false;
            }
        return true;
    }
    public boolean compare(String s,String y,String order)
    { 
        for(int i=0,j=0;i<s.length()&& j<y.length();i++,j++) {
            if(s.charAt(i)!=y.charAt(j)){
                if(order.indexOf(s.charAt(i))>order.indexOf(y.charAt(j)))
                    return false;
                else
                    return true;
            }
        }
        if(s.length()>y.length())return false;
        return true;
    }
}