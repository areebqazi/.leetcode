class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        List<List<Integer>>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                ArrayList<Integer>b=new ArrayList<>();
                int no=0-nums[i]-nums[j];
                
         if(map.get(no)!=null && i!=j && map.get(no)!=i && map.get(no)!=j){ 
             
                int max = Math.max(nums[i], Math.max(nums[j], no));
                int min = Math.min(nums[i], Math.min(nums[j], no));
                int mid = nums[i] + nums[j] + no - max - min;
                    b.add(min);
                    b.add(mid);
                    b.add(max);
                    set.add(b);
                }
            }
        }
        for(List<Integer>bb:set)
            a.add(bb);
        return (a);
    }
}