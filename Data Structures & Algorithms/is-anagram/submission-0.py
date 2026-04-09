class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Use hashmaps, keys = letters, value= frequency
        if len(s) != len(t):
            return False
        dictS = {}
        dictT = {}
        for letter in s:
            if letter not in dictS:
                dictS[letter] = 1
            else:
                dictS[letter] += 1
        # dictT
        for letter in t:
            if letter not in dictT:
                dictT[letter] = 1
            else:
                dictT[letter] += 1
        # Check: compare all keys and values
        for key in dictS:
            if key not in dictT or dictS[key] != dictT[key]:
                return False
        return True