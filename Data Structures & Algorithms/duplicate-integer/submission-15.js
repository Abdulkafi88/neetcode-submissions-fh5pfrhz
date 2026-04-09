class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
      nums.sort((a, b) => a - b);
      let L = 0 ; 
      let R = 1  ; 

      while(R < nums.length){
        if(nums[L] ==nums[R]){
          return true 
        }R++
        L++
      }return false  ;
    }
}
