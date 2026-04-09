class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let L = 0 ;
        let R = nums.length -1 ; 

        while (L <R){
            let mid = Math.floor((L + R) / 2)
            if(nums[mid] > nums[R]){
                L = mid + 1 
            }else { 
                R = mid
            }
        } return nums[L];
    }
}
