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
        //Then we need to make the recursive call to our helper method, we need to check if the height of the root is -1
        //this means that our tree is not balance, we give the root, traverse the tree, calculate the balance factor in each sub tree
        //and then we return if that sub tree is balance or not until we get to the root again
        return treeHeight(root) != -1;
    }
    //We need a helper method to get the hight of each subtree to validate if it is balance or not
    public int treeHeight(TreeNode child) {
        //if we receive a null node, that means we are on a leave so we reach the end and we return 0
        if(child == null) return 0;
        //then we need to calculate the height of the left sub tree, since this is bottom-up approach we get to the leaves of the tree
        //and then we have to climb to the root, calculating our balance factor in the process
        int left = treeHeight(child.left);
        //we get the height of the right sub tree
        int right = treeHeight(child.right);
        //then we need to calculate the balance factor, this is the difference in height between each left and right sub tree
        int balance_factor = Math.abs(left-right);
        //we know that if the balance factor is greater than 1 we dont have a balance tree, so we use this condition to return false
        //also we need to check if we already had a -1 (false) if this is the case our tree is not balance so we have to keep returning
        //false untill we reach the top
        if(balance_factor > 1 || left == -1 || right == -1) return -1;
        //after this we calculate the height of the current sub tree
        return 1 + Math.max(left, right);
        //this approach is O(n) because we are not calculating the height of each sub tree every time
    }
}