class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let map = new Map(); 

        for(let ch of nums){
           if(map.has(ch)){
            return true
           }  map.set(ch, (map.get(ch) || 0) + 1 )
        }return false 
    }
}
