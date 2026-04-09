class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        

        for(int num: nums){
            seen.add(num);
        }

        int longest = 0; 
        
        for(int num: nums){
            int count = 1;
            int currNum = num + 1; 
            while(seen.contains(currNum)){
                count++;
                currNum++;
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }
}
