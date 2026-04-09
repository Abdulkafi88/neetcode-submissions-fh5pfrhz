class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int correctIndex = nums[i] - 1;
            if(i != correctIndex && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                if(i != correctIndex && nums[i] == nums[correctIndex]){
                    return nums[i];
                }
            }
        }

        return 0;
    }
}
