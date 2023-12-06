class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        ArrayList<String>r=new ArrayList<>();
        int i =0;
        String temp="";
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
                i++;
            }
            else{
                r.add(temp);
                temp="";
                int j=i+1;
                while( j<s.length() && s.charAt(j)==' ') j++;
                i = j;
            }
        }
            r.add(temp);
        String result="";
        for(int l=r.size()-1;l>=0;l--){
            result+=(l!=0 ) ? r.get(l)+" " : r.get(l);
        }
        return result;
    }
}