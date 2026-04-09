class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let L = 0; 
        let R = 1; 
        let max = 0;

        while (R < prices.length) {
            if (prices[R] > prices[L]) {
                max = Math.max(max, prices[R] - prices[L]);
            } else {
                L = R; 
            }
            R++; 
        }

        return max;
    }
}
