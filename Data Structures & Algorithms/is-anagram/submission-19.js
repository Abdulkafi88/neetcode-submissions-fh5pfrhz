class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let map = new Map(); 
        if(s.length !== t.length) return false
        for(let ch of s){
            map.set(ch , (map.get(ch) || 0) + 1 )
        }

        for(let ch of t){
            if(!map.has(ch))return false 
                 map.set(ch , (map.get(ch) - 1 ))
            if(map.get(ch) < 0 ) return false 
        } 

        return true ; 
    }
}
