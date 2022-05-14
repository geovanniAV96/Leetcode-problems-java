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
    public List<Integer> preorderTraversal(TreeNode root) {
        //First we create our list that we are going to return
        ArrayList<Integer> tree = new ArrayList<>();
        //We do our recursive call
        return preorderTraversal(root, tree);
    }
    
    List<Integer> preorderTraversal(TreeNode root, List<Integer> tree)
    {
        //we check our base case, in this example is if the root is null
        if(root == null)
        {
            //if is null we return our current list
            return tree;
        }
        //here we add the root to our list
        tree.add(root.val);
        //then we check the left side, printing the root while doing it
        tree = preorderTraversal(root.left, tree);
        //and finally we check the right side
        return preorderTraversal(root.right, tree);
    }
}