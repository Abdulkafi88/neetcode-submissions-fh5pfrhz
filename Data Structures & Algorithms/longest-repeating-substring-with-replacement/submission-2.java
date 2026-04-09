class Solution {
    public int characterReplacement(String s, int k) {
        int r = 0;
        int l = 0;

        Map<Character,Integer> map = new HashMap<>();

        int longest = 1;

        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            //check if it's satisfied
            // window - max freq <= k
            int max = getMaxFreq(map);
            int window = r - l + 1;
            if(window - max <= k){
                longest = Math.max(longest, window);
            }else{
                while(window - max > k){
                    map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                    max = getMaxFreq(map);
                    l++;
                    window = r - l + 1;
                }
            }
            r++;
        }
        return longest;
    }

    public int getMaxFreq(Map<Character,Integer> map){
        int maxFreq = Integer.MIN_VALUE;
        for(int val: map.values()){
            maxFreq = Math.max(maxFreq, val);
        }

        return maxFreq;
    }
}
