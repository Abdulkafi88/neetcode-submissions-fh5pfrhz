class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findAllPermutation(nums, result, new ArrayList<>());
        return result;
    }

    void findAllPermutation(int[] nums, List<List<Integer>> result, List<Integer> list){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int num: nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            findAllPermutation(nums, result, list);
            list.remove(list.size() - 1);
        }
    }
}
