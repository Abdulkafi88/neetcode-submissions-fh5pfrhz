/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {boolean}
     */
    isBalanced(root) {
        let height = true
        let posorder = function (node){
            if(node === null)return 0 ; 
           let leftheight =  posorder(node.left); 
            let rightheight = posorder(node.right); 
            if( Math.abs(leftheight - rightheight ) > 1 ){
                height = false
            }
             return  Math.max(leftheight, rightheight) + 1 ;
        }
        posorder(root)

       return height
    }
}
