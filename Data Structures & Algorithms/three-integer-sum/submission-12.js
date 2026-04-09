class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        nums.sort((a , b) => a - b ); 
        let answer = []; 

        for(let i = 0 ; i < nums.length -2 ;i++){
             if (i > 0 && nums[i] === nums[i - 1]) continue;
             if (nums[i] > 0) break;
            let L = i + 1 ; 
            let R = nums.length -1 ; 
            while(L < R ){
                 if(nums[L] + nums[R] + nums[i] === 0){
                answer.push([nums[L] , nums[R] , nums[i]])
                L++; 
                R--; 
                while(L < R && nums[L] === nums[L -1 ])L++
            while(L < R && nums[L] === nums[R + 1])R--
            }else if(nums[L] + nums[R] + nums[i]  < 0){
                L++
            }else { 
                R--
            }
            }
           
        }return answer; 
    }
}
