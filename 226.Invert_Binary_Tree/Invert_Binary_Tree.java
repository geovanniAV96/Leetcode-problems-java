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
        return invertTreeHelper(root);
    }
    
    public TreeNode invertTreeHelper(TreeNode root)
    {
        if(root != null)
        {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTreeHelper(root.left);
            invertTreeHelper(root.right);
        }
        return root;
    }
}