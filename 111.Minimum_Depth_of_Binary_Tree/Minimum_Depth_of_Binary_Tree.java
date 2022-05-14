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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        return 1 + minDepth(root.left, root.right);
    }
    
    public int minDepth(TreeNode left, TreeNode right)
    {
        if(left == null && right == null)
        {
            return 0;
        }
        else if(right == null)
        {
            return 1 + minDepth(left.left, left.right);
        }
        else if(left == null)
        {
            return 1 + minDepth(right.left, right.right);
        }
        else
        {
            return 1 + Math.min(minDepth(left.left, left.right), minDepth(right.left, right.right));
        }
        
    }
}