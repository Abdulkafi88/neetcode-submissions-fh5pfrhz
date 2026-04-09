class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        // set up the pointers 
        // while loop 
        // set up my bainer search 
        // set up my if stement 
        // return the index of the target 
        let L = 0 ; 
        let R = nums.length -1 ; 
       
        while (L <=R){
            let mid = Math.floor((L + R) / 2 )
            if(nums[mid] === target){
                return mid ; 
            }else {
                 if (nums[L] <=nums[mid]){
                     if (nums[L] <=target && target <=nums[mid]){
                        R  = mid  - 1 
                    }else {
                        L = mid + 1 
                    }
                }else {
                    if(nums[mid] < target && target <= nums[R]){
                        L = mid + 1 
                    }else {
                        R = mid - 1 
                    }
                }
            }
        }return -1 
    }
}
