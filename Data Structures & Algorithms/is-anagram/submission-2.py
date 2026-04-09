class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Step 1: Check if lengths are equal
        if len(s) != len(t):
            return False
    
    # Step 2: Create a character count dictionary
        count = {}
    
    # Count characters in the first string
        for char in s:
            count[char] = count.get(char, 0) + 1
    
    # Subtract counts based on the second string
        for char in t:
            if char not in count:
                return False
            count[char] -= 1
            if count[char] < 0:
                return False
            
        return True
         