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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        int[] count = new int [] {0, 0};
        inOrder(root, k, count);
        return count[1];
    }

    void inOrder(TreeNode root, int k, int[] count){
        if(root == null){
            return;
        }
        inOrder(root.left, k, count);
        count[0]++;
        if(count[0] == k){
            count[1] = root.val;
            return;
        }
        inOrder(root.right, k, count);
    }


}

