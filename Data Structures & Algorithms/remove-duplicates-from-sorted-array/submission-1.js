class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    removeDuplicates(nums) {
       let L = 0 ;
       let R = 1  ; 

       while( R  < nums.length  ){
        if(nums[L] !=nums[R]){
            L++
            nums[L] = nums[R]
            
        }R++
       }return L + 1 
    }
}
