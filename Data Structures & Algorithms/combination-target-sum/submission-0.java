class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(result, nums, target, new ArrayList<>(), 0);
        return result;
    }

    void  findCombination(List<List<Integer>> result, int[] nums,
                         int target, List<Integer> current, int index){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i < nums.length; i++){
            if(nums[i] <= target){
                current.add(nums[i]);
                findCombination(result, nums, target - nums[i], current, i);
                current.remove(current.size() - 1);
            }
        }

    }

}
