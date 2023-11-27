class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]= new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i]) && map.get(target-numbers[i])>i){
                ans[0]=i+1;
                ans[1]=map.get(target-numbers[i]);
                    return ans;
            }
        }
        return ans;
    }
}