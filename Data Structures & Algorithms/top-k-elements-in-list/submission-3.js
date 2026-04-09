class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map(); 

        for(let ch of nums){
            map.set(ch, (map.get(ch) || 0) + 1); 
        }

        let  val = Array.from(map.entries()).sort((a, b) => b[1] - a[1])
        return val.slice(0 , k ).map(([ch,frq])=>ch)

    }
}
