class Solution {
    public List<String> letterCombinations(String s) {
        if(s.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        helper("", s, result);

        return result;
    }

    void helper(String p, String up, List<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
        // 
         int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        int end = ((digit - 2) * 3) + 2;
        if(digit == 7 || digit == 9){
            end = end + 1;
        }
        if(digit > 7){
            start += 1;
            end += 1;
        }
        for (int i = start ; i <= end; i++) {
            char ch = (char)('a' + i);
            helper(p + ch, up.substring(1), result);
        }
    }
}
