class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String temp="";
            int sum=0;
            int count=0;
            for(int i=0;i<s.length();i++){
                if(count==k){
                    temp+=sum;
                    sum=0;
                    count=0;
                }
                if(count<k){
                    sum+=s.charAt(i)-'0';
                    count++;
                }
            }
            temp+=sum;
            s=temp;
            // System.out.println(temp);
        }
        return s;
    }
}