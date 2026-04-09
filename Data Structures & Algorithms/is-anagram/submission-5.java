class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            int char1 = s.charAt(i) - 'a';
            int char2 = t.charAt(i) - 'a';

            arr[char1]++;
            arr[char2]--;
        }

        for(int number : arr){
            if(number != 0){
                return false;
            }
        }

        return true;
    }
}
