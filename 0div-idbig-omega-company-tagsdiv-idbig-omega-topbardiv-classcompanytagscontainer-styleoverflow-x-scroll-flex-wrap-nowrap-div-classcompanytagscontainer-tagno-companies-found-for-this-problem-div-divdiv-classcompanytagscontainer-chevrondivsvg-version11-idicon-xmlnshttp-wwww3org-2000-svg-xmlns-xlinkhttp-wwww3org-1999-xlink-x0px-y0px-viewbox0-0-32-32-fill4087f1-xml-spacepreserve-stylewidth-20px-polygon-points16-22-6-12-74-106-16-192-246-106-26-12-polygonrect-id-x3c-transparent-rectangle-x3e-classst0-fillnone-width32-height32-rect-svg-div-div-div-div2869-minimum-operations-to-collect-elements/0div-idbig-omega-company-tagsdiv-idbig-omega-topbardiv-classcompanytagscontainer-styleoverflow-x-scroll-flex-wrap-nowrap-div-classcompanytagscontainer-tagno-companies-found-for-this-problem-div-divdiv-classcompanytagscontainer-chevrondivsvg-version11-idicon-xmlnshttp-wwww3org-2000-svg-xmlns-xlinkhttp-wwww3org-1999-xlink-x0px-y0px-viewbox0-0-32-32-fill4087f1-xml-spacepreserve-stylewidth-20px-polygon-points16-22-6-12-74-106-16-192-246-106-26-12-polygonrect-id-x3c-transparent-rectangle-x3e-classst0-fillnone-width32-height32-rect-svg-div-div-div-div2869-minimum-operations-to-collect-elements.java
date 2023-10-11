class Solution {
    public int minOperations(List<Integer> nums, int k) {
        List<Integer>list= new ArrayList<>();
        for(int i = 1;i<=k;i++)
            list.add(i);
        for(int j = nums.size()-1; j>=0; j--){
            if(list.contains(nums.get(j))){
                list.remove(nums.get(j));
            }
            if(list.size()==0) return nums.size()-j;
        }
        return 0 ;
    }
}