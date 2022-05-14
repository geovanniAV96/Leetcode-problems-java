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
    public TreeNode sortedArrayToBST(int[] nums) {
        //First we need to return null if we receive an empty array
        if(nums.length == 0) return null;
        //then we call our recursive method that will return the final tree, for this method we are going to use
        //binary search, because we have a sorted array, so we start with the complete array
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    //here we have our recursive method
    public TreeNode sortedArrayToBST(int[] nums, int left, int right)
    {
        //first we need to check that we are not out of bounds in the rage that we specify
        if(left > right) return null;
        //now we have to get our middle point to start our binary search
        int midpoint = left + (right - left) / 2;
        //This is going to be the root of the sub tree that we are in, so we need to create it
        TreeNode node = new TreeNode(nums[midpoint]);
        //now we do our recursive call firs for the left side, the result of this will be the left child of the root
        node.left = sortedArrayToBST(nums, left, midpoint - 1);
        //then we do the left side, the result will be the right child of the root in this sub tree
        node.right = sortedArrayToBST(nums, midpoint + 1, right);
        //Finally we return the root of this sub tree
        return node;
    }
}