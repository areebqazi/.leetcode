class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String s="1";
        for(int k=2;k<=n;k++){
        String ss="";
        for(int i=0;i<s.length();){
            int count=1;
            int no=s.charAt(i)-'0';
            int j=i+1;
            while(j<s.length()  && (s.charAt(j)-'0')==no){
                count++;
                j++;
            }
            ss+=count+""+no;
            i=i+count;
        }
            s=ss;
        }
        return s;
    }
}