class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {string}
     */
    minWindow(s, t) {
       let need = new Map();
    for (let c of t) {
        need.set(c, (need.get(c) || 0) + 1);
    }
    
    let have = new Map();
    let L = 0;
    let result = "";
    let matched = 0;
    
    for (let R = 0; R < s.length; R++) {
        have.set(s[R], (have.get(s[R]) || 0) + 1);
        
        if (have.get(s[R]) === need.get(s[R])) {
            matched++;
        }
        
        while (matched === need.size) {
            if (result === "" || R - L + 1 < result.length) {
                result = s.slice(L, R + 1);
            }
            
            if (have.get(s[L]) === need.get(s[L])) {
                matched--;
            }
            have.set(s[L], have.get(s[L]) - 1);
            L++;
        }
    }
    
    return result;
    }
}
