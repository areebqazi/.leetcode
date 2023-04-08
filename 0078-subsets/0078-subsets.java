class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>result=new ArrayList<>();
        subset(0,result,nums,nums.length);
        return ans;
    }
    public void subset(int index,List<Integer>result,int arr[],int n){
        if(index==n){
            List<Integer>temp=new ArrayList<>(result);
            ans.add(temp);
            return;
        }
        result.add(arr[index]);
        subset(index+1,result, arr, n);
        result.remove(result.size()-1);
        subset(index+1,result,arr,n);
    }
}
