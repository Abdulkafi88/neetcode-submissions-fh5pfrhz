class Solution {
    /**
     * @param {number} target
     * @param {number[]} nums
     * @return {number}
     */
    minSubArrayLen(target, nums) {
        let cursum = 0 ; 
        let length = Infinity; 
        let L = 0 ; 

        for(let R = 0 ; R < nums.length; R++){
            cursum+=nums[R]

            while(cursum >= target){
                length = Math.min(R - L + 1 , length) ; 
                cursum-=nums[L]
                L++
            }
        }
        if(length ===Infinity ){
            return 0 
        }

        return length;


        
    }
}
