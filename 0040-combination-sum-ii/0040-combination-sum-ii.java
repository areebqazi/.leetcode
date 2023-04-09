class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>result=new ArrayList<>();
        sum(0,candidates,target,result);
        return ans;
    }
    
    public void sum(int index,int arr[],int target,List<Integer>result){
        if(target==0){
            ans.add(new ArrayList<>(result));
            return ;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            result.add(arr[i]);
            sum(i+1,arr,target-arr[i],result);
            result.remove(result.size()-1);
        }
    }
}