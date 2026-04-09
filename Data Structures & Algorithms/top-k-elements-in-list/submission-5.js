class Solution {
    topKFrequent(nums, k) {
     
        let map = new Map();
        for (let ch of nums) {
            map.set(ch, (map.get(ch) || 0) + 1);
        }
        let convert = Array.from(map); 

        convert.sort((a , b) => b[1] - a[1])

        let result = [] ; 

        for(let i = 0 ; i < k; i++){
           result.push(convert[i][0])
           
        }

        return result

    }
}