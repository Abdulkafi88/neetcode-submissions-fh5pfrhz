class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length)return false ; 
        let map = new Map();
        for(let ch of s){
            map.set(ch, (map.get(ch)|| 0) + 1)
        }

        for(let cha of t){
            if(!map.has(cha))return false 
            map.set(cha, (map.get(cha)|| 0)-1)
             if(map.get(cha) < 0 ) return false 
        }return true ; 
    }
}
