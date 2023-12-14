class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;        
        int mid = Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=small){
                small=i;
            }
            else if (i<=mid){
                mid = i;
            }
            else{
                return true;
            }
        }
        return false;
    }
}