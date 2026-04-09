class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let seen = new Set() ; 
        let L = 0 ;
        let longest = 0 ; 

        for(let R  = 0 ; R < s.length; R++){

            while(seen.has(s[R])){
                seen.delete(s[L])
                L++
            }
            seen.add(s[R])
            longest = Math.max(longest , R -  L + 1)
        }return longest ; 

    }
}
