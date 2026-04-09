class Solution {
    public boolean isAnagram(String s, String t) {
  
        Map<Character, Integer> charToCount = new HashMap<>();
        for(char ch: s.toCharArray()){
            charToCount.put(ch, charToCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println(charToCount);


        for(char ch: t.toCharArray()){
            if(!charToCount.containsKey(ch)){
                return false;
            }
            charToCount.put(ch, charToCount.get(ch) - 1);
            if(charToCount.get(ch) < 0){
                return false;
            }
        } 

        for(int val: charToCount.values()){
            if(val != 0){
                return false;
            }
        }


        return true;
    }
}
