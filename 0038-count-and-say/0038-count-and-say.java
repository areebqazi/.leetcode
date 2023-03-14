class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String s="1";
        for(int k=2;k<=n;k++){
        s=say(s);
        }
        return s;
    }
    
String say(String s){
    String ss="";
    int no=s.charAt(0)-'0';
    int count=0;
    for(int i=0;i<s.length();i++){
         if(s.charAt(i)-'0'==no){
            count++;
        } else {
        ss+=count+""+no;
        no=s.charAt(i)-'0';
        count=1;
        }
    }
    if(count>0)
        ss+=count+""+no;
    return ss;
   }
}



