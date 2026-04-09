class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let count = 0 ; 

        for(let i = 0 ; i < heights.length ; i ++){
            for(let j = i + 1  ; j < heights.length; j++){
                  const width = j - i;
                let area = Math.min(heights[i] , heights[j])
                count = Math.max(count , area * width)
               
            }
        }return count 
    }
}
