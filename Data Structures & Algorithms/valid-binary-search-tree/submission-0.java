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
    public boolean isValidBST(TreeNode root) {
     if(root == null){
        return true;
     }
     return helper(root, null, null);
    }

    boolean helper(TreeNode root, Integer lower, Integer upper){
        if(root == null){
            return true;
        }
        if((lower != null && lower >= root.val) || (upper != null && upper <= root.val)){
            return false;
        }
        return helper(root.left, lower, root.val) && helper(root.right, root.val, upper);
    }
}
