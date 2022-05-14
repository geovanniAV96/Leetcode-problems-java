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
    public TreeNode invertTree(TreeNode root) {
        //if we receive a null we just return it
        if(root == null) return root;
        //we make our recursive calls for both sides of the tree
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        //Since we are swaping the node at each extreme we just need to get at the bottom of the tree
        //and swap those nodes
        root.right = left;
        root.left = right;
        //finally we just return the root with the final tree
        return root;
    }
}