class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>a=new ArrayList<>();
       HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(m.getValue()>(nums.length/3))
                a.add(m.getKey());
        }
        return a;
    }
}