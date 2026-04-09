class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int r = 0;
        int l = 0;
        int longest = 1;

        if(s.isEmpty()){
            return 0;
        }

        while(r < s.length()){
            char ch = s.charAt(r);
            if(!(seen.contains(ch))){
                seen.add(ch);
                longest = Math.max(longest,r - l + 1);
                r++;
            }else{
                while(seen.contains(s.charAt(r))){
                    seen.remove(s.charAt(l));
                    l++;
                }
            }
        }

        return longest;
    }
}
