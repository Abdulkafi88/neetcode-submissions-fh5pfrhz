class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 0;
        while(right < prices.length){
         
           if(prices[right] < prices[left]){
            left = right;
           }else{
              profit = Math.max(profit, prices[right] - prices[left]);
           }
           right++;
        }
        return profit;
//
// profit = 0
// 
        //[10, 1, 5, 6, 7, 1]. if left <= right right--
                                // else left++
      // i = 1
    // dp[i] = 
    }
}
