class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>temp=new ArrayList<>();
        sum(0,target,candidates,temp,candidates.length);
        return ans;
    }
    public void sum(int index,int target,int arr[],List<Integer>result,int n){
        if(index==n || target==0){
            if(target==0){
                List<Integer>temp=new ArrayList<>(result);
                ans.add(temp);
            }
            return;
        }
       result.add(arr[index]);
       if(target-arr[index]>=0){
          sum(index,target-arr[index],arr,result,n);
        }
       result.remove(result.size()-1);
       sum(index+1,target,arr,result,n);
        
   }
}