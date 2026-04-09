class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Use hashmaps, keys = letters, value= frequency
        if len(s) != len(t):
            return False
        dictS = {}
        for letter in s:
            if letter not in dictS:
                dictS[letter] = 1
            else:
                dictS[letter] += 1
        # dictT
        for letter in t:
            if letter not in dictS:
                return False
            else:
                dictS[letter] -= 1
        
        for key in dictS:
            if dictS[key] != 0:
                return False
        return True
         