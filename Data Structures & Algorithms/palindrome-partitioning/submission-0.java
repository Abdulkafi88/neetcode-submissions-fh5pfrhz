class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(result, s, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(List<List<String>> result, String s, List<String> list, int index){
        if(index >= s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                list.add(s.substring(index, i + 1));
                dfs(result, s, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
    boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
