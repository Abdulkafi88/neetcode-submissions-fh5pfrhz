class Solution {
    /**
     * @param {string} word1
     * @param {string} word2
     * @return {string}
     */
    mergeAlternately(word1, word2) {
    let result = ''
    let L = 0 ; 

       while(L < word1.length || L < word2.length){

            if(L < word1.length){
                result+=word1[L]
            } if (L < word2.length) {
            result += word2[L];
            }
            L++
       }return result
    }
}
