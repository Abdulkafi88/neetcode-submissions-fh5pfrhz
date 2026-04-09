class Solution {
    /**
     * @param {number[]} arr
     * @param {number} k
     * @param {number} threshold
     * @return {number}
     */
    numOfSubarrays(arr, k, threshold) {
        let res = 0;
        let curSum = 0;

        for (let i = 0; i < k - 1; i++) {
            curSum += arr[i];
           
        }

        for (let L = 0; L <= arr.length - k; L++) {
            curSum += arr[L + k - 1];
            if (curSum / k >= threshold) {
                res++;
            }
            curSum -= arr[L];
        }

        return res;
    }
}