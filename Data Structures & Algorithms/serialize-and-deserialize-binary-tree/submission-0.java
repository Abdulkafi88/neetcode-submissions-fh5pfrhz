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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //[1, 2, null, null, 3, 4, null, null, 5, null, null]
        StringBuilder builder = new StringBuilder();
        populateString(root, builder);
        return builder.toString();
    }

    public void populateString(TreeNode root, StringBuilder builder){
        if(root == null){
            builder.append("null").append(",");
            return;
        }
        builder.append(String.valueOf(root.val)).append(',');
        populateString(root.left, builder);
        populateString(root.right, builder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] parts = data.split(",");
        int[] index = new int[] {0};
        return helper(parts, index);
    }

    TreeNode helper(String[] parts, int[] index){
       String val = parts[index[0]];
       if(val.equals("null")){
        return null;
       }

       TreeNode node = new TreeNode(Integer.parseInt(val));
       index[0]++;
       node.left = helper(parts, index);
       index[0]++;
       node.right = helper(parts, index);
       return node;
    }
}
