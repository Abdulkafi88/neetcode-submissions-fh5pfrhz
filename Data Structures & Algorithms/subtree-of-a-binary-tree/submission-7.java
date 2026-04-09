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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String mainTree = preOrderTraversal(root, new StringBuilder());
        String subTree = preOrderTraversal(subRoot, new StringBuilder());

        return mainTree.contains(subTree);
    }

    String preOrderTraversal(TreeNode root, StringBuilder builder){
        if(root == null){
            builder.append("null");
            return builder.toString();
        }
        builder.append(root.val);
        preOrderTraversal(root.left, builder);
        preOrderTraversal(root.right, builder);
        return builder.toString();
    }
}
