class Solution {
    public boolean increasingTriplet(int[] nums) {
         int low = Integer.MAX_VALUE , med = Integer.MAX_VALUE;
        for(int i:nums){
          if(i<low)  low=i;
          if(i>low && i<med)  med=i;
          if(i>low && i>med) return true;
        }
        return false;
    }
}