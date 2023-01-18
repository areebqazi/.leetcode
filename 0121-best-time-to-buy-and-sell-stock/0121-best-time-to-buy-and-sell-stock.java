class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                max=0;
            }
            if(prices[i]>max)
                max=prices[i];
            if(max-min > profit)
                profit =max-min;
        }
        return profit ;
    }
    
}