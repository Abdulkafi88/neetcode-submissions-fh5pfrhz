class Solution {
    public boolean canJump(int[] nums) {
        int des = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= des){
                des = i;
            }
        }

        return des == 0;
    }
}
