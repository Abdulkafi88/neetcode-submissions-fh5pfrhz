class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> empMap = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(empMap.containsKey(complement)){
                return new int[]{empMap.get(complement), i};
            }else {
                empMap.put(nums[i], i);
            }
            
        }
        return new int[0];
    }
}
