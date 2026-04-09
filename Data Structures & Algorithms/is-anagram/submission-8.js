class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length)return false 
        let freq  = new Map (); 

        for(let ch of s){
            freq.set(ch, (freq.get(ch)|| 0) + 1)
            //   freq.set(ch, (freq.get(ch) || 0) + 1);
        }
        for (let ch of t) {
            if (!freq.has(ch)) return false;
            freq.set(ch, freq.get(ch) - 1);
            if (freq.get(ch) < 0) return false;
        }
        return true; 
    }
}
