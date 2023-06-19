class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[100001];
        for(int i:nums){
            arr[i]++;
            if(arr[i]>1)
                return i;
        }
        return -1;
    }
}