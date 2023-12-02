class Solution {
    public int reverse(int x) {
        if(x==0 || x==Integer.MAX_VALUE || x==Integer.MIN_VALUE) return 0;
        int sign = x < 0 ? -1 : 1;
        return sign*rev(Math.abs(x)); 
    }
    public int rev(int x){
        int reverse=0;
        while(x!=0){
            int d = x%10;
            if(reverse>Integer.MAX_VALUE/10) 
                return 0;
            reverse=reverse*10+d;
            x/=10;
        }
        return reverse;
    }
}