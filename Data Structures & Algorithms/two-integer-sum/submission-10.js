class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let map = new Map (); 

       for(let i = 0 ; i < nums.length ; i++){
        let sum = target - nums[i]

            if(map.has(sum)){
                return [map.get(sum), i]
            }map.set(nums[i], i  )
       }
    }
}
