class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // [1,1,2,3,4,5,4]
        // 7 - 3
        return nums[nums.length - k];
    }
}
