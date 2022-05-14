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
        //If we receive a null tree we just return 0 because the height of nothing is 0
        if(root == null) return 0;
        //Then we make our recursive call to check the left side of the tree
        int minLeft = minDepth(root.left);
        //After that we check the right side
        int minRight = minDepth(root.right);
        //Now we have to handle the special case when we have a tree that has nodes only to one side
        //for example [3,null,20,15,7] if we dont handle this we get that the minimum depth is 1
        //but in reallity we have to return 3, to handle this we check if one side's height is 0
        if(minLeft == 0 || minRight == 0)
        {
            //if one of the sides is 0 we return the maximum of the two + 1 to account for the root
            return 1 + Math.max(minLeft, minRight);
        }
        //Finally we return the minimum of the two sides + 1 to account for the root
        return 1 + Math.min(minLeft, minRight);
    }
}