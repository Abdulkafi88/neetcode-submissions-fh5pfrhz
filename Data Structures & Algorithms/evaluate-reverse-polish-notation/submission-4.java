class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for(String s: tokens){
            if(!isOperator(s)){
                operands.push(Integer.parseInt(s));
            }else{
               int a = operands.pop();
               int b = operands.pop();
               int result;
               switch (s) {
                case "+": result = a + b; break;
                case "-": result = b - a; break;
                case "*": result = a * b; break;
                case "/": result = b / a; break;
                default: throw new IllegalArgumentException("Unknown operator: " + s);
            }

               operands.push(result);
            }
        }
        return operands.peek();
    }

    public boolean isOperator(String operator){
        return operator.equals("+") ||
               operator.equals("-") ||
               operator.equals("*") ||
               operator.equals("/");
    }
}
