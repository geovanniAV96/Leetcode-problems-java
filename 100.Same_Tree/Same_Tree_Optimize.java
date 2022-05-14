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
        //We need to check all our base cases for both trees
        //The first one is when both roots are null
        if(p == null && q == null)
        {
            //then we return true
            return true;
        }
        //If only one of the roots is null 
        else if(p == null || q == null)
        {
            //we have to return false
            return false;
        }
        //if the value of the roots is not equal
        else if(p.val != q.val)
        {
            //then the trees are not equal so we return false
            return false;
        }
        else
        {
            //now we have our recursive call, so we have to check our left and right sub trees
            //if both sub trees are equal we return true, and we do that until we reach the end of the tree
            //or we find a sub tree that is not equal, so the complexity is O(n)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
    }
}