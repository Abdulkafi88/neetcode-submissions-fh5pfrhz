class Solution {
    topKFrequent(nums, k) {
        let map = new Map(); 
        let res = []; 

        for(let ch of nums){
            map.set(ch , (map.get(ch) || 0) + 1)
        }
        let convert = Array.from(map) ; 
        convert.sort((a , b) => b[1] - a[1]) ; 

        for(let i = 0 ; i < k ; i++) {
            res.push(convert[i][0])
        }


        return res
        console.log(convert)
    }
}