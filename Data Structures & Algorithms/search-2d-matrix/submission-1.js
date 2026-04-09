class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
    let m = matrix.length ; 
    let n = matrix[0].length ; 

    let L = 0 ; 
    let R = m * n -1 ;

        while(L <= R){
            let mid = Math.floor((L + R) /2 ); 
            let row = Math.floor(mid / n )
            let col = mid % n ; 
            let value = matrix[row][col];

            if(value === target) return true; 
            else if ( value < target) L = mid + 1 
            else { 
                R = mid -1
            }
        }return false
    }
}
