class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
        let L = 0 ; 
        let R = numbers.length -1 ; 

        while ( L < R ){
            let ans = numbers[L]  + numbers[R]; 

            if(ans === target){
                return [L + 1  ,  R + 1 ]
               
            }else if ( ans <  target){
                L++
            }else { 
                R--
            }
        }
    }

}
