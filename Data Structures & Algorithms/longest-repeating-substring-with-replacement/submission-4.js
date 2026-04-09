class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let map = new Map();
    let L = 0;
    let maxFreq = 0;
    let maxLen = 0;

    for (let R = 0; R < s.length; R++) {
        map.set(s[R], (map.get(s[R]) || 0) + 1);
        maxFreq = Math.max(maxFreq, map.get(s[R]));

      
        if ( R - L + 1 - maxFreq > k) {
            map.set(s[L], map.get(s[L]) - 1);
            L++;
        }

        maxLen = Math.max(maxLen, R - L + 1);
    }

    return maxLen;
    }
}
