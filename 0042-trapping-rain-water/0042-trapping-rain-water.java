class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int l = 0;
        int r = height.length-1;
        int sum=0;
        int maxL=height[0];
        int maxR=height[height.length-1];
        while(l<r){
            int temp;
            if(maxL<=maxR){
                temp = maxL-height[l];
                l++;
                maxL=Math.max(height[l],maxL);
            }
            else{
                temp = maxR-height[r];
                r--;
                maxR=Math.max(height[r],maxR);
            }
            if(temp>0) sum+=temp;
        }
    return sum;
    }
}