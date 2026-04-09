class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> noneDup = new HashSet<>();

        for(int num : nums){
            if(noneDup.contains(num)){
                return true;
            }
            noneDup.add(num);
        }


        return false;
    }
}