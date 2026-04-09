class Solution {
    /**
     * @param {number[]} nums1
     * @param {number} m
     * @param {number[]} nums2
     * @param {number} n
     * @return {void} Do not return anything, modify nums1 in-place instead.
     */
     merge(nums1, m, nums2, n) {
        let pointerone = m - 1;          // last real number in nums1
        let pointertwo = n - 1;          // last number in nums2
        let pointerthree = m + n - 1;    // last spot in nums1

        while (pointertwo >= 0) {
            if (pointerone >= 0 && nums1[pointerone] > nums2[pointertwo]) {
                nums1[pointerthree] = nums1[pointerone];
                pointerone--;
            } else {
                nums1[pointerthree] = nums2[pointertwo];
                pointertwo--;
            }
            pointerthree--;
        }
    }
}
