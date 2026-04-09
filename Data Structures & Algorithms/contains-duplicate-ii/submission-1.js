class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {boolean}
     */
    containsNearbyDuplicate(nums, k) {
        let seen = new Set(); 
        let L = 0 ; 

        for(let R = 0 ; R < nums.length; R++ ){
            if(seen.has(nums[R])){
                return true
            }seen.add(nums[R])
            if(R - L +1 > k){
                seen.delete(nums[L])
                L++
            }
        }return false 

    }
}
