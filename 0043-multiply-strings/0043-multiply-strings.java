class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        String zero="";
        String ans="";
        ArrayList<StringBuilder>a=new ArrayList<>();
            for(int j=num2.length()-1;j>=0;j--){
                String s=multiply(num1,num2.charAt(j)-'0');
                s+=zero;
                StringBuilder sb=new StringBuilder(s);
                a.add(sb);
                zero+="0";
            }
        int carry=0;
        while(a.size()!=0){
            int x=0;
            x+=carry;
            carry=0;
            for(int i=0;i<a.size();i++){
                StringBuilder ss=a.get(i);
                // System.out.println("ss= "+ss);
                x+=ss.charAt(ss.length()-1)-'0';
                ss.deleteCharAt(ss.length()-1);
                a.set(i,ss);
                // System.out.println("a= "+a);
                if(ss.length()==0){
                    a.remove(ss);
                    i--;
                    // System.out.println("after removing a= "+a);
                }
            }
             // System.out.println("x= "+x);
            if(x>9)
            carry=x/10;
            int rem=x%10;
            // System.out.println("carry= "+carry);
            // System.out.println("rem= "+rem);
            ans=rem+ans;
            // System.out.println("ans= "+ans);
        }
        if(carry>0)
            ans=carry+ans;
        return ans;
        }
    String multiply(String s,int no){
        int i=s.length()-1;
        int carry=0,rem=0;
        String ss="";
        while(i!=-1){
            int x=(s.charAt(i)-'0')*no+carry;
            carry=0;
            if(x>9)
            carry=x/10;
            rem=x%10;  
            ss=rem+ss;
            i--;
        }
        if(carry>0)
            ss=carry+ss;
        return ss;
    }
    }