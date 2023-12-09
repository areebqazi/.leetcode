class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String s="";
        while(i>=0 || j>=0){
            int a=0,b=0;
            int sum=0;
            if(i>=0) a=num1.charAt(i)-'0';
            if(j>=0) b=num2.charAt(j)-'0';
            sum=a+b+carry;
            s=(sum%10) + s ;
            carry=sum/10;
            i--; j--;
        }
        if(carry!=0) s=carry+s;
        return s;
    }
}