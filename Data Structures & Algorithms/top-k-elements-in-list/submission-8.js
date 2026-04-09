class Solution {
    topKFrequent(nums, k) {
        let map = new Map(); 
        for(let ch of nums){
            map.set(ch , (map.get(ch) || 0) + 1)
        }

      return [...map.keys()].sort((a , b ) => map.get(b) -  map.get(a)).slice(0 , k )
    }
}