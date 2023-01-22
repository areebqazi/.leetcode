class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int a[]=new int [nums.length];
        a[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            a[i]=a[i-1]*nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            a[i]=a[i-1]*p;
            p=p*nums[i];
        }
        a[0]=p;
        return a;
    }
}