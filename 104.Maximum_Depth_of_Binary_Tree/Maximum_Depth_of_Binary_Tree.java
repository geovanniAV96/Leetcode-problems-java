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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        return 1 + maxDepth(root.left, root.right);
    }
    
    public int maxDepth(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) 
        {
            return 0;
        }
        else if(left != null && right == null)
        {
            return 1 + maxDepth(left.left, left.right);
        }
        else if(left == null && right != null)
        {
            return 1 + maxDepth(right.left, right.right);
        }
        else
        {
            return 1 + Math.max(maxDepth(left.left, left.right), maxDepth(right.left, right.right));
        }
    }
}