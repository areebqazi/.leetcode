class Solution {
    public int alternateDigitSum(int n) {
        int m;
        if((n+"").length()%2==0)
            m=-1;
        else
            m=+1;
        int sum=0;
        while(n!=0){
            sum+=(n%10)*m;
            if(m==-1)
                m=+1;
            else
                m=-1;
            n/=10;
        }
        return sum;
    }
}