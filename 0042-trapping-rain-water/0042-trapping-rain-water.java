class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int l = 0;
        int r = height.length-1;
        int sum=0;
        int maxL=height[0];
        int maxR=height[height.length-1];
        while(l<r){
            if(maxL<=maxR){
                int temp = maxL-height[l];
                if(temp>0) sum+=temp;
                l++;
                maxL=Math.max(height[l],maxL);
            }
            else{
                int temp = maxR-height[r];
                if(temp>0) sum+=temp;
                r--;
                maxR=Math.max(height[r],maxR);
            }
        }
    return sum;
    }
}