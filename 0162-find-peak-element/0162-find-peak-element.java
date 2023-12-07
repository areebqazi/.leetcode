class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int max = Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}
