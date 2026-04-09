/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //[root: 1, left: 2, right: 3, 4] [left: 2, root: 1, right: 3, 4]
        //get the root from preorder the first element 
        //from the start of inorder to the root element
        // get the number of element before the root.
        if(inorder.length == 0 || preorder.length == 0){
            return null;
        }
        int root = preorder[0];
        int left = 0;
        for(int num: inorder){
            if(num == root){
                break;
            }
            left++;
        }
        TreeNode node = new TreeNode(root);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, left+1),
                            Arrays.copyOfRange(inorder, 0, left));
        node.right = buildTree(Arrays.copyOfRange(preorder, left + 1, preorder.length),
                            Arrays.copyOfRange(inorder, left + 1, inorder.length));

        return node;
    }
}
