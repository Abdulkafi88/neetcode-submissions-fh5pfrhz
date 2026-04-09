class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxSubArray(nums) {
        let maxsum = nums[0] ; 
        let cursum = 0 ; 

        for(let n of nums){
            cursum = Math.max(cursum , 0)
            cursum+=n; 
            maxsum = Math.max(maxsum , cursum )
        }
        return maxsum 
    }
}
