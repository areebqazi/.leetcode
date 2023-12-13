class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int s=0;
        int e=nums.length-1;
        int result=nums[0];
        while(s<=e){
            if(nums[s]<=nums[e]){
               result = Math.min(result,nums[s]);
               return result;
            }
            int mid = (s+e)/2;
            result = Math.min(result,nums[mid]);
            if(nums[s]<=nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return result;
    }
}