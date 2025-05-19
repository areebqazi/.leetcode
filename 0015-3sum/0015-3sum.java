class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0 , r = nums.length-1;
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list  = new ArrayList<>();
        for(int i = 0 ; i < nums.length ;i++) {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            pair(nums,0 - nums[i],i+1,set);
        }
        for(List<Integer>temp:set) list.add(temp);
        return list;
    }
    public void pair(int numbers[], int target , int i,HashSet<List<Integer>> set){
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                List<Integer> temp = Arrays.asList(-1*target, numbers[i], numbers[j]);
                set.add(temp);
                i++;j--;
            } else {
                if (sum > target) j--;
                else i++;
            }
        }
    }
}