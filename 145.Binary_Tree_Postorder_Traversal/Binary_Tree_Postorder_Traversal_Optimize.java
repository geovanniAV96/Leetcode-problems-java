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
    public List<Integer> postorderTraversal(TreeNode root) {
        //We create an array list to save the tree in post order
        List<Integer> tree = new ArrayList<>();
        //we check if the root is valid, if not we return an empty list
        if(root == null) return tree;
        //we create a stack to keep track of nodes visited
        Stack<TreeNode> nodes = new Stack<>();
        //we push the root to break the loop in the first iteration
        nodes.push(root);
        //we loop through the tree until our stack is empty
        while(!nodes.isEmpty())
        {
            //we set the current node as the top element in our stack
            TreeNode current = nodes.pop();
            //we add current value at the start of our list
            //this will help us to shift the elements and have the root at the end of the list
            //for example: [1,3,2] you add first the root 3, then check left then right, so you have 2 at the top of the stack
            //then you add 2 to the list: 2,3 shifting 3 to the end, and finally you add 1 at the start, resulting in: 1,2,3
            tree.add(0, current.val);
            //we check the left side
            if(current.left != null)
            {   
                //if we have something we push it to the stack
                nodes.push(current.left);
            }
            //then we check the right side
            if(current.right != null)
            {
                //if we have something we push it to the stack
                nodes.push(current.right);
            }
            //basically we are doing the process backwards
        }
        //finally we return the list
        return tree;
    }
}