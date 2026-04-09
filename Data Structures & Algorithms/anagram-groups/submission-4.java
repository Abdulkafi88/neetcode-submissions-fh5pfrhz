class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
           groups.computeIfAbsent(sortedS, k -> new ArrayList<>()).add(s);
        }
      
        return new ArrayList<>(groups.values());
    }
}
