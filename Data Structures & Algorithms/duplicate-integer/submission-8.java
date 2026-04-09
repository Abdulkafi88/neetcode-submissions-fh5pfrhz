class Solution {
    public boolean hasDuplicate(int[] nums) {
        // store key value 
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int number : nums){
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        for(int value : count.values()){
            if(value > 1){
                return true;
            }
        }
        return false;
    }
}