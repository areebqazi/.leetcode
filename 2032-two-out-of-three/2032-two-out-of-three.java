class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>a= new HashSet<>();
        HashSet<Integer>b= new HashSet<>();
        HashSet<Integer>c= new HashSet<>();
        
        for(int i:nums1) a.add(i);
        for(int i:nums2) b.add(i);
        for(int i:nums3) c.add(i);
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i:a) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:b) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:c) map.put(i,map.getOrDefault(i,0)+1);
         
        List<Integer>result = new ArrayList<>();
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(m.getValue()>=2) result.add(m.getKey());
        }
        
       return result;

    }
}