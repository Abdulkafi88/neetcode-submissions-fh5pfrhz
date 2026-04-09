class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let left = 0; 
        let right = 1
        let max = 0 ; 
        
        while(left < prices.length ){
            if(prices[right] > prices[left]){
                max = Math.max(max , prices[right] - prices[left])
            
            }else {
                 left = right
            }right++
        }return max
        
    }
}
