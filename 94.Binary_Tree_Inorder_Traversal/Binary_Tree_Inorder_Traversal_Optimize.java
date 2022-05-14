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
    public List<Integer> inorderTraversal(TreeNode root) {
        //First we need to create a stack to store the traversed nodes
        Stack<TreeNode> traversedNodes = new Stack<>();
        //Then we need the list that we are going to return
        List<Integer> outputArray = new ArrayList<>();
        //We need to check if we receive an empty tree
        if(root == null) return outputArray;
        //Now we create a pointer for our current visited node, starting from the root
        TreeNode current = root;
        //Then we loop until we traverse the tree completely or while our stack isn't empty
        //because when we reach the leaves current will be null but the stack will not
        while(current != null || !traversedNodes.isEmpty())
        {
            //now we have to loop again to reach the last node to the left side of our root
            //we need to remember that inorder traversal refers to visit each node of the tree
            //from left to right and bottom to top, so while we dont reach the end (null)
            //of the left sub tree
            while(current != null)
            {
                //we push to our stack the current node
                traversedNodes.push(current);
                //then we make our current our left node
                current = current.left;
            }
            //After we traverse the left side we pop our current node
            current = traversedNodes.pop();
            //and we add this value to our output list
            outputArray.add(current.val);
            //now we can traverse the right side of this sub tree
            current = current.right;
        }
        //When we are finish with the right side we can return our output list
        return outputArray;
        
    }
}