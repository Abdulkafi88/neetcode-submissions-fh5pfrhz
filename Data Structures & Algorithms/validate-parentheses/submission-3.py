class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for bracket in s:
            if bracket in '({[':
                stack.append(bracket)
            else:
                if bracket == ')':
                    if not stack or stack.pop() != '(':
                        return False
                elif bracket == '}':
                    if not stack or stack.pop() != '{':
                        return False
                else:
                    if not stack or stack.pop() != '[':
                        return False
        return True if not stack else False