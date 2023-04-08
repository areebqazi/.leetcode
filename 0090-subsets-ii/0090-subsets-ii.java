class Solution {
        HashSet<List<Integer>>set=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>result=new ArrayList<>();
        subset(0,result,nums,nums.length);
        List<List<Integer>>ans=new ArrayList<>();
        for(List<Integer>a:set)
            ans.add(a);
        return ans;
    }
    public void subset(int index,List<Integer>result,int arr[],int n){
        if(index==n){
            List<Integer>temp=new ArrayList<>(result);
            set.add(temp);
            return;
        }
        result.add(arr[index]);
        subset(index+1,result, arr, n);
        result.remove(result.size()-1);
        subset(index+1,result,arr,n);
    }
}