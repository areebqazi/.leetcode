class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int i = num1.length()-1;
        int j = num2.length()-1;
        String result="";
        int z=0;
        while(j>=0){
            String temp = multiplySingle(num1,num2.charAt(j)-'0');
            for(int l=1;l<=z;l++) temp+=0;
            result = add (result,temp);
            j--; z++;
        }
        return result;
    }
    public String add(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int a=0,b=0;
            int sum=0;
            if(i>=0) a=num1.charAt(i)-'0';
            if(j>=0) b=num2.charAt(j)-'0';
            sum=a+b+carry;
            sb.append(sum%10);
            carry=sum/10;
            i--; j--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
    public String multiplySingle(String num,int d){
        int carry = 0;
        int i = num.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0){
            int product = ((num.charAt(i)-'0')*d)+carry;
            sb.append(product%10);
            carry=product/10;
            i--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}