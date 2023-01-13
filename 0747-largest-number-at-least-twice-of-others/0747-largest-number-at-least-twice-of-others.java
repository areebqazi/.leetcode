class Solution {
    public int dominantIndex(int[] nums) {
        int large=0;
        int index=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>large){
                large=nums[i];
                index=i;
            }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=large){
            if(nums[j]*2>large)
                return -1;
            }
        }
        return index;
    }
}