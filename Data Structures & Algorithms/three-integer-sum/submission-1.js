class Solution {
  /**
   * @param {number[]} nums
   * @return {number[][]}
   */
  threeSum(nums) {
    nums.sort((a, b) => a - b);

    const res = [];
    const n = nums.length;

    for (let i = 0; i < n; i++) {
      if (i > 0 && nums[i] === nums[i - 1]) continue;

      let L = i + 1;
      let R = n - 1;

      while (L < R) {
        const sum = nums[i] + nums[L] + nums[R];

        if (sum === 0) {
          res.push([nums[i], nums[L], nums[R]]);
          L++;
          R--;
          while (L < R && nums[L] === nums[L - 1]) L++;
          while (L < R && nums[R] === nums[R + 1]) R--;
        } else if (sum < 0) {
          L++;
        } else {
          R--;
        }
      }
    }

    return res;
  }
}
