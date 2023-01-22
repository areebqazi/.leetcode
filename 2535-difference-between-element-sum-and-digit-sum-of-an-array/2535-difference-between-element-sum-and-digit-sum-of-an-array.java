class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        String s="";
        for(int i:nums){
            sum1+=i;
            s+=i;
        }
        for(int i=0;i<s.length();i++)
            sum2+=s.charAt(i)-'0';
        return Math.abs(sum1-sum2);
    }
}