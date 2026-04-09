class Solution {
    public boolean hasDuplicate(int[] nums) {
        // set = {}
        // set = {1}
        // set = {1, 2}
        // set = {1, 2, 3}
        // set = {1, 2,,3, 4}
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if(set.contains(currentNum)){
                return true;
            }
            set.add(currentNum);
        }
        return false;
    }
}
