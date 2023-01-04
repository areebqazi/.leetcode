class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set=new HashSet<>();
               HashSet<Integer>set1=new HashSet<>();

        ArrayList<Integer>a=new ArrayList<>();
        for(int i:nums1)
            set.add(i);
        for(int j:nums2)
            if(set.contains(j))
                set1.add(j);
        int n[]=new int[set1.size()];
        int j=0;
        for(int i:set1){
            n[j++]=i;
        }
            return n;
    }
}