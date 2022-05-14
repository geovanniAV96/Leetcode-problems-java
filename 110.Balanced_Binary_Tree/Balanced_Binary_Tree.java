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
    public boolean isBalanced(TreeNode root) {
        //First we return true if we receive a null because tecnically if there is nothing the tree is balance
        if(root == null) return true;
        //We have tu check if the difference between each side of the tree is greater than 1
        //if it is then we dont have a balance tree, so we return false, to do this we do a recursive call
        //to our helper method to check the height of each side and then we check the difference
        if(Math.abs(treeHeight(root.left) - treeHeight(root.right)) > 1) return false;
        //we need to do a recursive call to check each time that we go deeper into the tree that we don't have
        //a subtree that is not balance, if we do we can stop early to say that we dont have a balance tree
        //if we reach the leaves with only true values then we have a balance tree and we return true
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //We need a helper method to get the hight of each subtree to validate if it is balance or not
    public int treeHeight(TreeNode child) {
        //if we receive a null node, that means we are on a leave so we reach the end and we return 0
        if(child == null) return 0;
        //finally we have our recursive call where we add 1 each time we go deeper into the tree to account
        //for each level, so at the end we return the height of this subtree
        return 1 + Math.max(treeHeight(child.left), treeHeight(child.right));       
    }
}