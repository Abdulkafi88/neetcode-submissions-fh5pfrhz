class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] strChar = word.toCharArray();
            Arrays.sort(strChar);

            String keyWord = new String(strChar);

            if(!map.containsKey(keyWord)){
                map.put(keyWord, new ArrayList<>());
            }
            map.get(keyWord).add(word);
            

        }

        return new ArrayList<>(map.values());
    }
}
