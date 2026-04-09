class Solution {
    public boolean isValid(String s) {
        //([{}]) -> 
        Stack<Character> open = new Stack<>();

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(isOpen(ch)){
                open.push(ch);
            }else{
                if(open.isEmpty()){
                    return false;
                }
                if((ch == ')' && open.peek() == '(') || (ch == '}' && open.peek() == '{')
                    || (ch == ']' && open.peek() == '[')){
                        open.pop();
                    }else{
                        return false;
                    }
            }
            i++;
        }
        return open.isEmpty();
    }

    public boolean isOpen(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }
}
