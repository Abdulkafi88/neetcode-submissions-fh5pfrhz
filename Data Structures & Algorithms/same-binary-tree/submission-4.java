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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode currN1 = q1.remove();
            TreeNode currN2 = q2.remove();
            if(currN1 != null && currN2 != null && (currN1.val != currN2.val)){
                return false;
            }
            if((currN1.left == null && currN2.left != null)
                || (currN1.left != null && currN2.left == null)){
                    return false;
            }
            if((currN1.right == null && currN2.right != null)
                || (currN1.right != null && currN2.right == null)){
                    return false;
            }
            if(currN1.left != null){
                q1.offer(currN1.left);
            }
            if(currN2.left != null){
                q2.offer(currN2.left);
            }
            if(currN1.right != null){
                q1.offer(currN1.right);
            }
            if(currN2.right != null){
                q2.offer(currN2.right);
            }
        }
        return true;
    }
}
