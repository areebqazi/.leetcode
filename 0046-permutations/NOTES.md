Approcah 1
class Solution {
public List<List<Integer>> permute(int[] nums) {
List<Integer>ds=new ArrayList<>();
List<List<Integer>>result=new ArrayList<>();
boolean arr[]=new boolean[nums.length];
perm(nums,ds,result,arr);
return result;
}
public void perm(int nums[],List<Integer>ds,List<List<Integer>>result,boolean check[]){
if(ds.size()==nums.length){
result.add(new ArrayList<>(ds));
return ;
}
for(int i=0;i<nums.length;i++){
if(check[i]!=true){
ds.add(nums[i]);
check[i]=true;
perm(nums,ds,result,check);
ds.remove(ds.size()-1);
check[i]=false;
}
}
}
}