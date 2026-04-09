class Solution {
    /**
     * @param {number[]} arr
     * @param {number} k
     * @param {number} threshold
     * @return {number}
     */
    numOfSubarrays(arr, k, threshold) {
        let maxsum = 0 ; 
        let cursum = 0 ; 
        let L = 0 ; 

        for(let R = 0 ; R < arr.length ; R++){
            cursum+=arr[R]

            if(R - L + 1 === k ){
                if(cursum / k >= threshold){
                    maxsum++ ;
                }
                 cursum-=arr[L] ; 
                 L++ 
            }
        }return maxsum
    }
}
