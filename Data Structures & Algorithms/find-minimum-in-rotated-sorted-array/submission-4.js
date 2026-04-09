class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        // first sort it ; 
        // the set up my two pointer 
        // set my whille loop
        // set my condtion 
        // return the min
        let L  = 0 ; 
        let R = nums.length -1 ; 
        while(L<R){
            let mid = Math.floor((L + R)/ 2)
            if(nums[mid] > nums[R]){
                L = mid + 1 
            } else {
                R = mid;
            }
        }return nums[L ]
    }
}
