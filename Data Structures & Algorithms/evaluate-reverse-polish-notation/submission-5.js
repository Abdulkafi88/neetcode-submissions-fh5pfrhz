class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let stk = []; // create an empty stack

        for (let t of tokens) {
            // check if token is an operator
            if (t === "+" || t === "-" || t === "*" || t === "/") {
                // pop top two numbers from stack
                let b = stk.pop(); // right operand
                let a = stk.pop(); // left operand

                if (t === "+") {
                    stk.push(a + b);
                } 
                else if (t === "-") {
                    stk.push(a - b);
                } 
                else if (t === "*") {
                    stk.push(a * b);
                } 
                else { // division
                    let division = a / b;

                    // truncate toward zero (LeetCode rule)
                    if (division < 0) {
                        stk.push(Math.ceil(division)); // example: -2.6 → -2
                    } else {
                        stk.push(Math.floor(division)); // example: 2.6 → 2
                    }
                }
            } else {
                // if token is a number, convert to integer and push to stack
                stk.push(Number(t));
            }
        }

        // final answer is the only number left in stack
        return stk.pop();
    }
}
