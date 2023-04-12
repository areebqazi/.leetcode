// approach  1 in notes
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        perm(0,nums,ans);
        return ans;
    }
    public void perm(int index,int arr[],List<List<Integer>>result){
        if(index==arr.length){
            List<Integer>temp=new ArrayList<>();
            for(int i:arr)
                temp.add(i);
            result.add(temp);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            perm(index+1,arr,result);
            swap(arr,i,index);
        }
    }
    public void swap (int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return;
    }
}