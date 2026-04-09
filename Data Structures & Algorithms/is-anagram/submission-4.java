class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            count[c1 - 'a']++;
            count[c2 - 'a']--;

        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }


        return true;
    }
}
