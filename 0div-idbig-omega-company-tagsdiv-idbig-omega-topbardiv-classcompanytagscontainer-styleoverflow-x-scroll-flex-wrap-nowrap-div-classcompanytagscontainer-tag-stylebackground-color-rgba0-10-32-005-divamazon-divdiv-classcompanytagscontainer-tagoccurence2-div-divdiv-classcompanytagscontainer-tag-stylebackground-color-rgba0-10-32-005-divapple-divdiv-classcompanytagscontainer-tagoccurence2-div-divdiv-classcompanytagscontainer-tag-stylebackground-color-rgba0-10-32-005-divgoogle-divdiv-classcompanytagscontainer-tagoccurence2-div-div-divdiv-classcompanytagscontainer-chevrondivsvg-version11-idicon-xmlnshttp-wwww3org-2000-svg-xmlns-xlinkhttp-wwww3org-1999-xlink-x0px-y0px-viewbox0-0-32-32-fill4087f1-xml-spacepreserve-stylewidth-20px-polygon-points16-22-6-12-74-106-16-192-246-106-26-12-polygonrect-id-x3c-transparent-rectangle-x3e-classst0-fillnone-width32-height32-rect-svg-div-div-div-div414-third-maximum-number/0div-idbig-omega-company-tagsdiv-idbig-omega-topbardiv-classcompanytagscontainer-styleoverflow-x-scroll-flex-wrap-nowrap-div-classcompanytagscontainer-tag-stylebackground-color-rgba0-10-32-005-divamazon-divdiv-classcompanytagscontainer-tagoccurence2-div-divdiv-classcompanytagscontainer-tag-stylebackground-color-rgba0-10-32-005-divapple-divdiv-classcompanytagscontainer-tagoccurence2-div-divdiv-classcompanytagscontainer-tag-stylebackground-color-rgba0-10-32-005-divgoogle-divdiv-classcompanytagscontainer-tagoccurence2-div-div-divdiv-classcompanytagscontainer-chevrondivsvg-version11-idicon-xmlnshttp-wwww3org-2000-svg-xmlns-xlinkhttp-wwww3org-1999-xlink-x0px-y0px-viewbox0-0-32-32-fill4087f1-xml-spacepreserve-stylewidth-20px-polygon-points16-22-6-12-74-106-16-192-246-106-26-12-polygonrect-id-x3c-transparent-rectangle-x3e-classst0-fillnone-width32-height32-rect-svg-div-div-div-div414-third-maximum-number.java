class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE ;
        for(int i:nums)   
            first= Math.max(i,first);
        for(int i:nums){
            if(i!=first){
                second = Math.max(i,second);
            }
        }
        int count=0;
        for(int i:nums){
            if(i!=first && i!=second){
                count++;
                third = Math.max(i,third);
            }
        }
        if(third == Integer.MIN_VALUE && count==0) return first;
        return third;
    }
}