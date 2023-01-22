class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int zc=0;
        for(int i:nums){
            if(i!=0)
            p*=i;
            else
            zc++;
        }
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zc==1)
            a[i]=p;
            else if(nums[i]==0 && zc>1)
            a[i]=0;
            else if(nums[i]!=0 && zc!=0)
            a[i]=0;
            else
            a[i]=p/nums[i];
        }
        return a;
        
    }
}