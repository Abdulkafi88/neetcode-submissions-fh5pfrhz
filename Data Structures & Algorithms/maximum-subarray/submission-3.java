class Solution {
    public int maxSubArray(int[] nums) {
         int max_sum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int n : nums){
            curSum = Math.max(0, curSum);
            curSum += n;
            max_sum = Math.max(curSum, max_sum);
        }
        return max_sum;
    }
}
