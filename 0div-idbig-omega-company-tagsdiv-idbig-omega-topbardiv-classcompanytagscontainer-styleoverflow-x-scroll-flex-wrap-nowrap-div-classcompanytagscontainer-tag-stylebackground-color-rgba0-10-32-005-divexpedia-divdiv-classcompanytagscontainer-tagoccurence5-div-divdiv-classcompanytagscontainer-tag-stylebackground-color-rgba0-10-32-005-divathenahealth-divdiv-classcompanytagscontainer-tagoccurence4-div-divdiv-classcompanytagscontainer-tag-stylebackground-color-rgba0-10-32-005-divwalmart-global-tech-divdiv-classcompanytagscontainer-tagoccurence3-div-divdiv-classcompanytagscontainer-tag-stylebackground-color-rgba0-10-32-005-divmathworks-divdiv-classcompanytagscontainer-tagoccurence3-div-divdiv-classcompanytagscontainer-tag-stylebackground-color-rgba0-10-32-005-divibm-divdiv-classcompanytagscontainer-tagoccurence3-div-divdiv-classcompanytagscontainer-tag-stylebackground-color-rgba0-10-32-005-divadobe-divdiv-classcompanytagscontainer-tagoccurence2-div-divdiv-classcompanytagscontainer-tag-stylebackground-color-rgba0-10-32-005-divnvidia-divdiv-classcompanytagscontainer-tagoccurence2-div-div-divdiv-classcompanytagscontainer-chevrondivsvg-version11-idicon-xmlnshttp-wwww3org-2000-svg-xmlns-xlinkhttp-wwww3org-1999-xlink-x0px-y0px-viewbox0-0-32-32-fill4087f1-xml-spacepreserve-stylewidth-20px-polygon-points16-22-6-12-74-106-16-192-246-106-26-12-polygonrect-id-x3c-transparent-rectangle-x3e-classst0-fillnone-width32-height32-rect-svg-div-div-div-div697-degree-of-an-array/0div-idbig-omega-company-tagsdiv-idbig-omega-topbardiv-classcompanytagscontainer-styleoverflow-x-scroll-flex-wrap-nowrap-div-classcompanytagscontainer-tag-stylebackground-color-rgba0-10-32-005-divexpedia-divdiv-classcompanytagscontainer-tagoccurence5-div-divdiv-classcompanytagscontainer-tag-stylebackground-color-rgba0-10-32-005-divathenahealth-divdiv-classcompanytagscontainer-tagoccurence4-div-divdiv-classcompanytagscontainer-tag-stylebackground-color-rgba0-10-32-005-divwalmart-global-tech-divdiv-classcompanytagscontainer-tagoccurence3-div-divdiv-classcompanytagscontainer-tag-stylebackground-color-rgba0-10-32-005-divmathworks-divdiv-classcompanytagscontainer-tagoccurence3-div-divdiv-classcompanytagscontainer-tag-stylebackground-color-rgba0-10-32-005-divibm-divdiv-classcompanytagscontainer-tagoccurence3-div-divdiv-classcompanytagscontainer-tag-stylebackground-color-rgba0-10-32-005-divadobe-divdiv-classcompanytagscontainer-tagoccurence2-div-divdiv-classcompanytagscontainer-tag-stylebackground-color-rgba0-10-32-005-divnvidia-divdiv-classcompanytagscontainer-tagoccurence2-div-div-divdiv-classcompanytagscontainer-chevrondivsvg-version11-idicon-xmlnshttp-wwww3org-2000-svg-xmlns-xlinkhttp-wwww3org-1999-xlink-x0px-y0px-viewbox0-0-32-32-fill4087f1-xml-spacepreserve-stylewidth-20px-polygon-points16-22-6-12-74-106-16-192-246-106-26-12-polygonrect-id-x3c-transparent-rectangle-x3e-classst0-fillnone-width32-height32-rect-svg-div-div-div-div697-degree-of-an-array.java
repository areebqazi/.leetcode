class Solution {
    public int findShortestSubArray(int[] nums) {
       int arr[]=new int[50000];
        int large=0;
        for(int i:nums){
            arr[i]++;
            large=Math.max(arr[i],large);
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(arr[i]==large){
                min = Math.min((lastIndexOf(nums,i)-indexOf(nums,i)+1),min);
            }
        }
        return min;
    }
    public int indexOf(int nums[],int n ){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n) return i;
        }
        return -1;
    }
    public int lastIndexOf(int nums[],int n ){
        for(int i=nums.length-1;i>=0 ;i--){
            if(nums[i]==n) return i;
        }
        return -1;
    }
    
}