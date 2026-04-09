class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        

        for(int num: nums){
            seen.add(num);
        }

        int longest = 0; 
        
        for(int num: nums){
            if (!seen.contains(num - 1)) { // only start from the beginning of a sequence
            int curr = num;
            int count = 1;

            while (seen.contains(curr + 1)) {
                curr++;
                count++;
            }

            longest = Math.max(longest, count);
        }
        }

        return longest;
    }
}
