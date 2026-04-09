class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    removeDuplicates(nums) {
        let L = 0 ; 
        let R = 0 ; 

        while(R < nums.length){
            if(nums[R]!==nums[L]){
                L++ ; 
                nums[L] = nums[R]
            }R++
        }return L +1
    }
}
