class Solution {
    public int maxArea(int[] arr) {
        int maxArea = 0;
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            maxArea = Math.max((Math.min(arr[l],arr[r])*(r-l)),maxArea);
            if(arr[l]<arr[r]) l++;
            else r--;
        }
        return maxArea;
    }
}