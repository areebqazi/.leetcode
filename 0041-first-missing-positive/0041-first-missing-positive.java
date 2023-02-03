class Solution {
    public int firstMissingPositive(int[] nums) {
         // if(nums.length==1 && nums[0]==0)
         //    return 1;
         // if(nums.length==1 && nums[0]==1)
         //    return 2;
         // if(nums.length==1 && nums[0]!=0 && nums[0]!=1)
         //     return 1;
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                set.add(nums[i]);
        }
        for(int x:set)
            a.add(x);
        if(a.size()==0)
            return 1;
        if(a.get(0)!=1 || a.get(0)==0)
            return 1;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i+1)!=a.get(i)+1)
                return a.get(i)+1;
        }
        return a.get(a.size()-1)+1;
    }
}