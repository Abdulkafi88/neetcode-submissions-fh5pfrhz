class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap stores our key and valeu so String would be the key 
        //and the List<String> hols a list of the anagrams 
        HashMap<String, List<String>> map = new HashMap<>();

        //Loop of the str array before sorting and adding the key
        for(String word : strs){
            //turn the str string into array of char
            char[] chars = word.toCharArray();
            //Using the sort method of array
            Arrays.sort(chars);
            // Key is our new sorted words 
            String key = new String(chars);
            //if the str words is not in the hashmap we 
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}
