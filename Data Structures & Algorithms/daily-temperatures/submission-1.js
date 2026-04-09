class Solution {
    /**
     * @param {number[]} temperatures
     * @return {number[]}
     */
    dailyTemperatures(temperatures) {
        let result = new Array(temperatures.length).fill(0)
        let st = []
        for(let i = 0; i < temperatures.length; i++){
    
        while(st.length > 0 && temperatures[st[st.length -1 ]] < temperatures[i]){
            let idx = st.pop();
            result[idx] = i - idx
        }
        st.push(i)
        }
        return result

    }

    
}
