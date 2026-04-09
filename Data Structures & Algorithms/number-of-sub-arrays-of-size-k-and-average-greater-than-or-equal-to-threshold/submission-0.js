class Solution {
    /**
     * @param {number[]} arr
     * @param {number} k
     * @param {number} threshold
     * @return {number}
     */
    numOfSubarrays(arr, k, threshold) {
        let windowSum = 0;
        let count = 0;
        let target = threshold * k;

        for (let i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                if (windowSum >= target) {
                    count++;
                }
                windowSum -= arr[i - k + 1]; // Slide window
            }
        }

        return count;
    }
}
