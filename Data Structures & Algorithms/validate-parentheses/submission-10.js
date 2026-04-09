class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let st = []; 
         const map = {
      '}': '{',
      ']': '[',
      ')': '(',
    };

    for(let ch of s){
        
        if(!map[ch]){
            st.push(ch)
        }else {
            if(st.length === 0) return false 
            if(map[ch]!==st.pop())return false 
        }
    }return  st.length === 0 
    }
}
