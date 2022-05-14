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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //First we have to check if we receive a null root, if we do we return false since the tree is empty there are no paths
        if(root == null) return false;
        //Now we need to create two stacks, one to keep track of the nodes in the tree
        Stack<TreeNode> node_stack = new Stack();
        //and another to keep track of the current sum
        Stack<Integer> sum_stack = new Stack();
        //We have to add the root to the node stack
        node_stack.add(root);
        //And we have to add the first value to the sum stack, in this case we want to get 0 from the sum
        //so we are going to substract the root value to the target sum
        sum_stack.add(targetSum - root.val);
        //Now we are going to loop through the tree until our stack of nodes is empty
        while(!node_stack.isEmpty())
        {
            //Then pop the top node in the stack and make it our current node
            TreeNode current_node = node_stack.pop();
            //and we do the same for our stack sum
            int current_sum = sum_stack.pop();
            //now we have to check if we are in a path root-to-leaf that give us the target sum
            //to check that we need a node that doesn't have child nodes and if the current sum is 0
            if(current_node.left == null && current_node.right == null && current_sum == 0)
            {
                //so we return true
                return true;
            }
            //No we have to check each side of the current node, first we are going to check the left side
            if(current_node.left != null)
            {
                //we add the left node to our stack of nodes
                node_stack.add(current_node.left);
                //and we do the same for the sum, but first we substract the value of the left node
                sum_stack.add(current_sum - current_node.left.val);
            }
            //Then we check the right side
            if(current_node.right != null)
            {
                //we add the left node to our stack of nodes
                node_stack.add(current_node.right);
                //and we do the same for the sum, but first we substract the value of the left node
                sum_stack.add(current_sum - current_node.right.val);
            }
        }
        //if we loop through the entire tree and we dont find a path with the target sum we return false
        return false;
    }
    
}