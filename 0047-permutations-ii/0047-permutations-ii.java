class Solution {
    HashSet<List<Integer>>set=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ds=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        perm(nums,ds,arr);
        for(List<Integer>i:set)
            result.add(i);
        return result;
    }
    public void perm(int nums[],List<Integer>ds,boolean check[]){
        if(ds.size()==nums.length){
            set.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i]!=true){
                ds.add(nums[i]);
                check[i]=true;
                perm(nums,ds,check);
                ds.remove(ds.size()-1);
                check[i]=false;
            }
        }
    }
}
    