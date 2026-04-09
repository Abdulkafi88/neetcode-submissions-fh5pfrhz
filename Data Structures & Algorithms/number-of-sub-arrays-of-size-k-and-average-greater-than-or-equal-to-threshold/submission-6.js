class Solution {
    /**
     * @param {number[]} arr
     * @param {number} k
     * @param {number} threshold
     * @return {number}
     */
    numOfSubarrays(arr, k, threshold) {
        let count = 0 ; 
        let max = 0
        for(let i = 0 ; i < k ; i++){
            count+=arr[i]; 
        }
        if(count / k >=threshold){
            max++
        }

        for(let R = k ; R< arr.length; R++){
            count -=arr[R - k ];
            count+= arr[R]; 
            if(count / k >= threshold){
                max++
            }
        }return max 
    }
}