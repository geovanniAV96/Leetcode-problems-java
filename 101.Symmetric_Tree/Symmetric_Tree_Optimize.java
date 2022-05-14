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
    public boolean isSymmetric(TreeNode root) {
        //First we need to check if our root is null, if it is we assume is true
        //because if you fold nothing technically you have the same so it's symmetric
        if(root == null)
        {
            return true;
        }
        //If not we need to check both sides of the root to see if they are symmetric
        return areSymetric(root.left, root.right);
    }
    
    public boolean areSymetric(TreeNode leftTree, TreeNode rightTree)
    {
        //if eithe side is null 
        if(leftTree == null || rightTree == null)
        {
            //we return whether the left and the right side are null or not
            return leftTree == rightTree;
        }
        //Now we have to check if the values are different, if they are we don't have a symmetrical tree
        if(leftTree.val != rightTree.val)
        {
            //so we return false
            return false;
        }
        //if we have a valid tree up to this point then we need to check if the sub tree is symmetric
        //for this we compare the left side left child with the right side right child and then 
        //we do the same with the left side right child and the right side left child to make our function recursive
        //making it a solution of O(n)
        return areSymetric(leftTree.left, rightTree.right) && areSymetric(leftTree.right, rightTree.left);
        
    }
}