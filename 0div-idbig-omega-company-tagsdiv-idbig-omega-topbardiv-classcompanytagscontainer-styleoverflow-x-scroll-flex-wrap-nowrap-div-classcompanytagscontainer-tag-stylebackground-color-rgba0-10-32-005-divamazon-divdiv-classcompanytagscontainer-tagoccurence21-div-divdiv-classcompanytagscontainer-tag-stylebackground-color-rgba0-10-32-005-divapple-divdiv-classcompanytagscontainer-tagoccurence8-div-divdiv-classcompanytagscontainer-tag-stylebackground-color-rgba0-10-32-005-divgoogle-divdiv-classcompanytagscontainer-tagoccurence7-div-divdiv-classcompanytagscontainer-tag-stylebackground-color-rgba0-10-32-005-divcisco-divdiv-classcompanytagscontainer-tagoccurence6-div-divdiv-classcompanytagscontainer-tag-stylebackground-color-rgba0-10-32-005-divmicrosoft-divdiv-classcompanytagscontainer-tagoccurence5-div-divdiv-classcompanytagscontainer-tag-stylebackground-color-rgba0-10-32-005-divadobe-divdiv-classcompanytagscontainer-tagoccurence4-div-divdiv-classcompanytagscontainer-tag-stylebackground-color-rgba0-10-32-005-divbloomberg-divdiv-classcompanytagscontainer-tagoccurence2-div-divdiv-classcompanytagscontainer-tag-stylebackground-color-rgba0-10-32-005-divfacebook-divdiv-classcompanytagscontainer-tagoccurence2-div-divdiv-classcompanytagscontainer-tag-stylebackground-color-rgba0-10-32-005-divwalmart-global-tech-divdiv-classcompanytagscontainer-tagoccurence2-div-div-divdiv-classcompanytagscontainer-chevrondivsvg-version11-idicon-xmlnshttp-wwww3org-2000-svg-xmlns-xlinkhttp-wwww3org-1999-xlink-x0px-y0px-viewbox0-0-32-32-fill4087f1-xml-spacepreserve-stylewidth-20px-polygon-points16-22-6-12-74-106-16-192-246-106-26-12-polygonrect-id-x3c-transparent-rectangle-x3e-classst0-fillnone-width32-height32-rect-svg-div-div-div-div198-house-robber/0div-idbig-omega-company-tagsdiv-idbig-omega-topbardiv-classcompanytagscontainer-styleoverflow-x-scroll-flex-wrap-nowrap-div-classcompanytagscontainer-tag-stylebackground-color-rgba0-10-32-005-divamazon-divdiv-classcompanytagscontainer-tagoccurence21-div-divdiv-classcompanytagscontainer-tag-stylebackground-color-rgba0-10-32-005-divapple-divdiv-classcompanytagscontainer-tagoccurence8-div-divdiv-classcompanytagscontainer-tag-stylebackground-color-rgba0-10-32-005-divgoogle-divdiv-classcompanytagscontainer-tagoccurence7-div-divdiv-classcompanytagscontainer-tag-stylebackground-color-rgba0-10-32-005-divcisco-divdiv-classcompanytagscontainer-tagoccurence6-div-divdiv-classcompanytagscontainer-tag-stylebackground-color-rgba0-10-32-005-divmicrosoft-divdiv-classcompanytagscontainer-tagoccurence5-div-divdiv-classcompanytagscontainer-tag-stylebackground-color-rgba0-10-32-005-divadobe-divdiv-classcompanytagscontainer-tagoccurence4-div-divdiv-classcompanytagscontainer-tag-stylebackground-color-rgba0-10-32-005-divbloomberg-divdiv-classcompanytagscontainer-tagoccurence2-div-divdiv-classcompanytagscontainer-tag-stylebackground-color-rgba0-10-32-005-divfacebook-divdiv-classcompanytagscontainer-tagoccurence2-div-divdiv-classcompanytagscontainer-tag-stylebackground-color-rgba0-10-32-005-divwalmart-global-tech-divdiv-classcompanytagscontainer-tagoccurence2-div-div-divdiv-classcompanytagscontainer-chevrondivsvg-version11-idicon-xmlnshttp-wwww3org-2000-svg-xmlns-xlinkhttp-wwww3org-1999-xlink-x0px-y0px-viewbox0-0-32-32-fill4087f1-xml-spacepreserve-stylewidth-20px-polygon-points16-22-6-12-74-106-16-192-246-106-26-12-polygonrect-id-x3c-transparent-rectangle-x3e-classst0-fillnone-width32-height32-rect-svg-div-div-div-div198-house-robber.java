class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return  robber(nums,0,dp);
    }
    public int robber(int nums[],int ind ,int dp[]){
        if(ind==nums.length-1){
            return nums[ind];
        }
        if(ind>=nums.length){
            return 0;
        }
        int pick = (dp[ind]!=-1) ? dp[ind] : nums[ind] + robber(nums,ind+2,dp);
        int notPick = (dp[ind]!=-1) ? dp[ind] : robber(nums,ind+1,dp);
        
        return dp[ind]= Math.max(pick,notPick);
    }
}