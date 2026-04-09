class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        // [3,4,5,6]
        // target = 7 ; 

        let map  = new Map(); 

        for(let i = 0 ; i < nums.length ; i++){
            let sum = target - nums[i]; 

            if(map.has(sum)){
                return [map.get(sum) , i]
            }map.set(nums[i] , i )
        }
    }
}
