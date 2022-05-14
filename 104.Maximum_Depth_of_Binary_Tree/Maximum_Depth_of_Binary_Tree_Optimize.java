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
        //first we have our base case, if our root is null we just return 0
        if(root == null) return 0;
        //if the root isn't null we have to check the left and right sub tree
        //first we check the left recursively
        int left = maxDepth(root.left);
        //then we check the right recursively
        int right = maxDepth(root.right);
        //and finally we pick the largest value between the left and the right
        //and we add 1 to account for the root
        return Math.max(left,right) + 1;
    }
}