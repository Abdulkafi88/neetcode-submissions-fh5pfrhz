class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        findCombination(result, candidates, target, 0, new ArrayList<>());
        return result;
    }
    private static void findCombination( List<List<Integer>> result, int[] candidates, int target, int index, ArrayList<Integer> current) {
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index; i < candidates.length; i++){
             if(candidates[i] <= target){
                 if(i > index && candidates[i] == candidates[i - 1]){
                     continue;
                 }
                 current.add(candidates[i]);
                 findCombination(result, candidates, target - candidates[i], i + 1, current);
                 current.remove(current.size() - 1);
             }
        }
    }
}
