class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
      let map = new Map();

      for(let ch of nums){
        map.set(ch , (map.get(ch) || 0) + 1)
      }

      for(let [key , val ] of map){
        if(val > 1){
            return true ;
        }
      }return false 
    }
}
