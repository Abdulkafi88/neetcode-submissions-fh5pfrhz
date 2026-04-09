class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if(groups.containsKey(sortedS)){
                groups.get(sortedS).add(s);
            }else{
                 List<String> newList = new ArrayList<>();
                 newList.add(s);
                groups.put(sortedS, newList);
            }
        }
        List<List<String>> subLists = new ArrayList<>();
        subLists.addAll(groups.values());
        return subLists;
    }
}
