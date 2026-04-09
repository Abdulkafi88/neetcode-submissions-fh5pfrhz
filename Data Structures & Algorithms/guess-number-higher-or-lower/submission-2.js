/**
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * function guess(num) {}
 */

class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    guessNumber(n) {
        let L = 0 ; 
        let R = n ; 

        while(L <=R ){
            let mid = Math.floor((L + R ) / 2 )
            let res = guess(mid)
            if(res === 0){
                return  mid; 
            }else if (res > -1 ){
                L = mid + 1 
            }else {
                R = mid -1 
            }
        }
    }
}
