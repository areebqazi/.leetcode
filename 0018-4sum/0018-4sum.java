class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashMap<Long,Integer>map=new HashMap<>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            map.put((long)nums[i],i);
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                for(int k=0;k<nums.length;k++){
                
                long no=(long)target-(long)nums[i]-(long)nums[j]-(long)nums[k];
         if(map.get(no)!=null && i!=j && i!=k && map.get(no)!=i && j!=k && map.get(no)!=j && map.get(no)!=k){ 
            long a=nums[i],b=nums[j],c=nums[k],d=no ,tmp;
          if (a > b) { tmp = a; a = b; b = tmp; };
          if (c > d) { tmp = c; c = d; d = tmp; };
          if (a > c) { tmp = a; a = c; c = tmp; };
          if (b > d) { tmp = b; b = d; d = tmp; };
          if (b > c) { tmp = b; b = c; c = tmp; };
                ArrayList<Integer>bl=new ArrayList<>();
                    bl.add((int)a);
                    bl.add((int)b);
                    bl.add((int)c);
                    bl.add((int)d);
                    set.add(bl);
                }
            }
        }
    }
        for(List<Integer>bb:set)
            al.add(bb);
        
        return (al);
    }
}