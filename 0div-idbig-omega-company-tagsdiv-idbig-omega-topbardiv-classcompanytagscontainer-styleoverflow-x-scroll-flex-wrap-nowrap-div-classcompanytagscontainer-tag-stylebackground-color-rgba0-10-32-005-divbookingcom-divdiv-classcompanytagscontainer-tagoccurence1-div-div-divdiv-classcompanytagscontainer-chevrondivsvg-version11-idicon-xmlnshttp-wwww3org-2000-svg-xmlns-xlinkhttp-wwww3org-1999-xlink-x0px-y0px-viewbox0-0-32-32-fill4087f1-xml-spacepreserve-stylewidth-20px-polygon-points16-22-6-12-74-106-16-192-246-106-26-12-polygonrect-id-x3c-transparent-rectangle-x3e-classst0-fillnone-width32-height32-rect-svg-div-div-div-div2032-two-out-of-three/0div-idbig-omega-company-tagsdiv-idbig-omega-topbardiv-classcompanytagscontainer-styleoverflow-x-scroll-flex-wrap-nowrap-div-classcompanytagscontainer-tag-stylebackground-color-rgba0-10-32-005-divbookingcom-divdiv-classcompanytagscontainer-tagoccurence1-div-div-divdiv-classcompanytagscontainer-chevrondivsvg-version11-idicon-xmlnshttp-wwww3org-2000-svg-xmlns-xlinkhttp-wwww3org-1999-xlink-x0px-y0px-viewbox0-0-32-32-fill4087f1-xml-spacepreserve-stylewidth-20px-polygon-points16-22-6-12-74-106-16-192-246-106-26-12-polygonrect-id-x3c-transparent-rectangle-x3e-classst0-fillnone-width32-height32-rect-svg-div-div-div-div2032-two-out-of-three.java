class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>a= new HashSet<>();
        HashSet<Integer>b= new HashSet<>();
        HashSet<Integer>c= new HashSet<>();
        
        for(int i:nums1) a.add(i);
        for(int i:nums2) b.add(i);
        for(int i:nums3) c.add(i);
        
        ArrayList<Integer>temp = new ArrayList<>();
        for(int i:a) temp.add(i);
        for(int i:b) temp.add(i);
        for(int i:c) temp.add(i);
        
        HashSet<Integer>d= new HashSet<>();
        for(int i:temp) d.add(i);
        
        ArrayList<Integer>result = new ArrayList<>();
        
        for(int i:d){
            int count =0;
            if(a.contains(i)) count++;
            if(b.contains(i)) count++;
            if(c.contains(i)) count++;
            if(count>=2) result.add(i);
        }
        
        return result;
    }
}