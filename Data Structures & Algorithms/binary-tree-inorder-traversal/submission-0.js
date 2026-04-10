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
     * @return {number[]}
     */
    inorderTraversal(root) {
        let ans = []; 

        let inorder = function (node){
            if (!node) return;
            inorder(node.left); 
            ans.push(node.val); 
            inorder(node.right)
        }
        inorder(root); 
        return ans 
    }
}