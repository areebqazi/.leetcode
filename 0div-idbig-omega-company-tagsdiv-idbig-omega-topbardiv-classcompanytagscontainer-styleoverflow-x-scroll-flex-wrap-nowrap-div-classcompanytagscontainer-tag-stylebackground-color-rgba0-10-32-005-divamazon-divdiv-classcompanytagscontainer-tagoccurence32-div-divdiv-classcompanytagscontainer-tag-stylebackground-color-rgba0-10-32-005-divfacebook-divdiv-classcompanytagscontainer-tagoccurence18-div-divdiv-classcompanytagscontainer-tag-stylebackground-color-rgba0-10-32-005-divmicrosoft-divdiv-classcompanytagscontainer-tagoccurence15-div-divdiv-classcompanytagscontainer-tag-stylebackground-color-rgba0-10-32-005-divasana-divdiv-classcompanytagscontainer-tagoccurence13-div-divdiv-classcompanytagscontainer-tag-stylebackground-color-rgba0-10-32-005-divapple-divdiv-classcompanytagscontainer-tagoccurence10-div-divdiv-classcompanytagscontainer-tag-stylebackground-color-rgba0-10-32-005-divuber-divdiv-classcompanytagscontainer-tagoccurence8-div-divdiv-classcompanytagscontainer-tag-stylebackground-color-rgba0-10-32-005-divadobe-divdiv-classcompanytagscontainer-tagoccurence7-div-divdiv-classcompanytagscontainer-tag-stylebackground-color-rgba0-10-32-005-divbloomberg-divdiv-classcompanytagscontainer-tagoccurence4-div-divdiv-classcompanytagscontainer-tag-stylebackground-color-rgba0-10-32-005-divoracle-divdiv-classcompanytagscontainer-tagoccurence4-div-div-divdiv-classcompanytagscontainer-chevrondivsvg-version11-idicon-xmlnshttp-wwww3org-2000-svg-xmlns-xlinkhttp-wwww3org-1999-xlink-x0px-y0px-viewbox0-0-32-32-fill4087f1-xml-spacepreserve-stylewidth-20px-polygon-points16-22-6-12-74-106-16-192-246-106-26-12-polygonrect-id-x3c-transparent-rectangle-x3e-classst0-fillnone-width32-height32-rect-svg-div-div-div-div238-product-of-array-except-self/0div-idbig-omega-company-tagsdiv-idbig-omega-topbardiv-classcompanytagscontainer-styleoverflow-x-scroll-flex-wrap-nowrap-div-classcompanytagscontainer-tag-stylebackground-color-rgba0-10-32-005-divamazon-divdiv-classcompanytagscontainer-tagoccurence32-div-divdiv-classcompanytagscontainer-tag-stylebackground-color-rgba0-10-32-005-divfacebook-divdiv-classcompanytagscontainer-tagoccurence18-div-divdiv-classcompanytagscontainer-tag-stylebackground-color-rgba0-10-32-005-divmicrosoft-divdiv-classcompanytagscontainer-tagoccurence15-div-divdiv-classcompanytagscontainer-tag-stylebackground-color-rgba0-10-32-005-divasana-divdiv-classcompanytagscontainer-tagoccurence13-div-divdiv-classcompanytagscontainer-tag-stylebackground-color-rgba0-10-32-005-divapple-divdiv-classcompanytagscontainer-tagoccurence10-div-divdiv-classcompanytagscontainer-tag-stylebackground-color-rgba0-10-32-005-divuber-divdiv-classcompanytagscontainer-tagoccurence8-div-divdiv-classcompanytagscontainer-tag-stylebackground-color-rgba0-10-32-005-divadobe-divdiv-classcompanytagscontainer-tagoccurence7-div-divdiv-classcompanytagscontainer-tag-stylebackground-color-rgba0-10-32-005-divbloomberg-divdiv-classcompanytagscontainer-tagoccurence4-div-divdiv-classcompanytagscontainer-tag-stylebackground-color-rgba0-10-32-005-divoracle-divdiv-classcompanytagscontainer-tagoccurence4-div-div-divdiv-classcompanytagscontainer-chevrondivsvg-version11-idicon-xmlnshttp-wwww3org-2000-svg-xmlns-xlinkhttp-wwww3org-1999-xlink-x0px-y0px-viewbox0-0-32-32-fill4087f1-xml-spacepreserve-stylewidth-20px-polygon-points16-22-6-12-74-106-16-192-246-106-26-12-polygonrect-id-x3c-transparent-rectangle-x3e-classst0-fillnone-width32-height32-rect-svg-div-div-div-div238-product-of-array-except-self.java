class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[]= new int [n];
        result[0]=1;
        for(int i=1;i<n;i++)
            result[i]=result[i-1]*nums[i-1];
        int postfix=1;
        for(int i=n-1;i>=0;i--){
            result[i]*=postfix;
            postfix*=nums[i];
        }
        return result;
    }
}