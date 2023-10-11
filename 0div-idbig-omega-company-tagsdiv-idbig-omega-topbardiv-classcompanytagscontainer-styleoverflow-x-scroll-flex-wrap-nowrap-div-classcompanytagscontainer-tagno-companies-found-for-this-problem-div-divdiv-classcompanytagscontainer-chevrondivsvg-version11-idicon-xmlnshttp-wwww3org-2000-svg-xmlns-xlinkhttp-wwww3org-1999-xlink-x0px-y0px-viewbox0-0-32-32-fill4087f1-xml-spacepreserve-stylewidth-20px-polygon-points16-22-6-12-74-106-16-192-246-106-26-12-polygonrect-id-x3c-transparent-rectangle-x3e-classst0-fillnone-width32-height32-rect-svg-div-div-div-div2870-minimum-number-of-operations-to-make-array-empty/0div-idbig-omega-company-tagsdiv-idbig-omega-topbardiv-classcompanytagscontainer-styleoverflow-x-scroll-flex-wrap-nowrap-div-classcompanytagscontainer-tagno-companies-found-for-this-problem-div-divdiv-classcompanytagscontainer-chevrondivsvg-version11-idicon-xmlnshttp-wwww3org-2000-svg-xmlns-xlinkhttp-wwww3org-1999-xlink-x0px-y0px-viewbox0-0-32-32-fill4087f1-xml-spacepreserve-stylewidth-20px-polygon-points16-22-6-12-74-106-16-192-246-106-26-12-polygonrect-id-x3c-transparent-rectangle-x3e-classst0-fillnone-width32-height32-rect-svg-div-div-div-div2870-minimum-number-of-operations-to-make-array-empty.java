class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans = 0 ;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int size= m.getValue();
            if(size==1)
            return -1;
            else if (size%3==0)
            ans+=size/3;
            else 
            ans+=size/3+1;
        }
        return ans;
    }
}