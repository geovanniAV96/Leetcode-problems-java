/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //We need to check where our nodes are, to do that we check if they are less than the current root
        //that means they are on the left side of the current root
        if(p.val < root.val && q.val < root.val)
        {
            //then we make our recursive call for the left side
            return lowestCommonAncestor(root.left, p, q);
        }
        //if the nodes aren't in the left side, that means they could be on the right side
        //so we check if they are greater than the current root
        else if(p.val > root.val && q.val > root.val)
        {
            //if they are we make our recursive call for the right side
            return lowestCommonAncestor(root.right, p, q);
        }
        //if none of the previous conditions is met that means both nodes are on different sides
        //or we find one of the nodes, that would mean that the current node is the lowest common ancestor
        else
        {
            //so we return it
            return root;
        }
    }
}