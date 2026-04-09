class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bestday = prices[0];
        int[] dp = new int[prices.length];

        for(int i = 1; i < prices.length; i++){
            bestday = Math.min(prices[i - 1], bestday);
            profit = Math.max(profit, (prices[i] -  bestday));
            dp[i] = profit;
        }
        return dp[prices.length - 1];
// 10        
// if prices[3] - min(prices[2], 1) 
// 6 - 1
// bestday = 0
        //[10, 1, 5, 6, 7, 1]
    //dp. [0, -9, 4, 5, 6, -1]
      // i = 1
    // dp[i] = 
    }
}
