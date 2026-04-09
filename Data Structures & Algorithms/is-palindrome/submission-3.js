class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        const cleanedString = s.toLowerCase().replace(/[^a-z0-9]/g, '');
        let L = 0 ; 
        let R = cleanedString.length -1 ; 

        while(L < R){
           if(cleanedString[L] !== cleanedString[R])return false ; 
           L++; 
           R-- 
            
        }return true ; 
    }
}
