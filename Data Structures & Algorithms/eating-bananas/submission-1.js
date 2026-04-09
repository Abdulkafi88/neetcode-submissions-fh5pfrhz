class Solution {
    /**
     * @param {number[]} piles
     * @param {number} h
     * @return {number}
     */
    minEatingSpeed(piles, h) {
        let L = 1;
        let R = Math.max(...piles);
        let answer = R;

        while (L <= R) {
            let mid = Math.floor((L + R) / 2);
            let hours = 0;

            for (let pile of piles) {
                hours += Math.ceil(pile / mid);
            }

            if (hours <= h) {
                answer = mid;   
                R = mid - 1;    
            } else {
                L = mid + 1;    
            }
        }
        return answer;
        
    }
}
