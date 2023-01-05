class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        char sign='+';
        if(s.charAt(0)=='-')
            sign='-';
        String ss="";
        int i=0;
        if(sign=='-' || s.charAt(0)=='+')
            i=1;
        for(;i<s.length();i++){
            if(ss.length()==0 && s.charAt(i)=='0')
                continue;
            if(Character.isDigit(s.charAt(i))) ss+=s.charAt(i);
            else break;
        }        
        if(ss.length()==0)
            return 0;
        
        if(ss.length()>10)
            return retM(sign);
        else if(ss.length()<10)
            return retI(sign,ss);
        
        else{
        String check="";
        if(sign=='+') check="2147483647";
        else check="2147483648";
        if(ss.charAt(0)>check.charAt(0)){
             return retM(sign);
         } 
        else if(ss.charAt(0)<check.charAt(0)){
            return retI(sign,ss);
        }
        else{  if(Integer.parseInt(ss.substring(1))>Integer.parseInt(check.substring(1)))
               return retM(sign);
               else
               return retI(sign,ss);
        }
        }
    }
    
    int retM(char i){
        if(i=='+') return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
    }
    int retI(char i,String no){
        if(i=='+') return Integer.parseInt(no);
            else return Integer.parseInt("-"+no);
    }
}