class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {

        let count = {}; 

        for(let item of nums){
          if(count[item]){
            return true; 
          }else{
            count[item] = 1
          }
        }return false



    }
}
