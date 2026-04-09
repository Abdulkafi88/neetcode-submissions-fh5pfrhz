class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @return {boolean}
     */
    checkInclusion(s1, s2) {
        if(s1.length > s2.length)return false
        let L = 0 ; 
      let map = new Map(); 
    let s2Map = new Map()
    for(let ch of s1){
        map.set(ch , (map.get(ch)||0) + 1)
        }
;

    for(let R = 0; R < s2.length; R++){
        // add s2[R] to s2Map
        s2Map.set(s2[R] , (s2Map.get(s2[R])|| 0) + 1)

        if(R - L + 1 > s1.length){
             s2Map.set(s2[L], s2Map.get(s2[L]) - 1);
            if (s2Map.get(s2[L]) === 0) {
                s2Map.delete(s2[L]);
            }
            L++
        }

    if(R - L + 1 === s1.length){
        if (
        [...map.keys()].every(key => map.get(key) === s2Map.get(key)) &&
        map.size === s2Map.size
    )return true; 
    }



    }return false 
      
    }
}
