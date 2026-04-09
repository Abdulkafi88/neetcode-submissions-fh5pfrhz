class Solution {
    public List<String> generateParenthesis(int n) {
        return generate(n, n, "");
    }
    List<String> generate(int open, int close, String s){
        if(open == 0 && close == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        List<String> currList = new ArrayList<>();

        if(open > 0 && open <= close){
            
            currList.addAll(generate(open - 1, close, s + "("));
        }
        if(close > 0 && close > open){
            currList.addAll(generate(open, close - 1, s + ")"));
        }
        return currList;
    }
}
