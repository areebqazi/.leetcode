class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder result=new StringBuilder();
        Collections.sort(dictionary);
        String s[]=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            String word=new String();
            int len=Integer.MAX_VALUE;
            for(int j=0;j<dictionary.size();j++){       
        if( s[i].length()>= dictionary.get(j).length() && s[i].substring(0,dictionary.get(j).length()).equals(dictionary.get(j)) && s[i].length()<len){
                    word=dictionary.get(j);
                    len=dictionary.get(j).length();
                }
        }
            if(!word.equals(""))
                result.append(word+" ");
            else
                result.append(s[i]+" ");
    }
        result.delete(result.length()-1,result.length());
        return result.toString();
}
}