class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0, gcd(str1.length(),str2.length()));
    }
    public int gcd(int x, int y) {
        int gcd=0;
          for(int i = 1; i <= x && i <= y; i++)  
           {  
            if(x%i==0 && y%i==0)  
            gcd = i;  
            }    
        return gcd;
    }
}