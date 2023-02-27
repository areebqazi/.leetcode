class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            ArrayList<String>a=new ArrayList<>();
            int count=0;
            String temp="";
            for(int i=0;i<s.length();i++){
                if(count==k){
                    count=0;
                    a.add(temp);
                    temp="";
                }
                if(count<k){
                    temp+=s.charAt(i);
                    count++;
                }
            } 
             a.add(temp);
            s="";
            for(String x: a){
                int sum=0;
                for(int i=0;i<x.length();i++){
                    sum+=x.charAt(i)-'0';
                }
                s+=sum;
                sum=0;
            }
        }
        return s;
    }
}