 class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        System.out.println(map);
        for(int i=0;i<nums.length-1;i++){
            if(map.get(nums[i])==1)
                continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(i-j)<=k)
                        return true;
                }
            }
        }
        return false;
    }
}
    