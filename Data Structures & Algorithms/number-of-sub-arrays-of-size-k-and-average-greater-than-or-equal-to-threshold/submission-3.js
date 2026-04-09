class Solution {
    /**
     * @param {number[]} arr
     * @param {number} k
     * @param {number} threshold
     * @return {number}
     */
    numOfSubarrays(arr, k, threshold) {
         if(arr.length < k){
            return 0 ;
        }
        let sum = 0 ; 
        let count = 0 ; 
        for(let i = 0 ; i < k ; i++){
            sum+=arr[i]
        }
         if(sum / k   >= threshold ){
                count++
            }
       


        for(let R = k ; R < arr.length ; R++){
            sum += arr[R]
            sum-=arr[R - k ]

            if(sum / k   >= threshold ){
                count++
            }
        }return count 
    
    }
}
