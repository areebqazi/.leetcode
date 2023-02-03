class Solution {
    public int[] findErrorNums(int[] nums) {
        int extra=-1,lost=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i))
                extra=i;
            set.add(i);
        }
        for(int i=1;i<nums.length;i++){
            if(!set.contains(i)){
                lost=i;
                break;
            }
        }
        int arr[]=new int[2];
            arr[0]=extra;
        if(lost==-1)
            lost=nums.length;
            arr[1]=lost;
        return arr;
    }
}