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
        ArrayList<Integer> tree = new ArrayList<>();
        //Queue<Integer> nodes = new LinkedList<>();
        Stack<TreeNode> nodes = new Stack<>();
        while(!nodes.isEmpty() || root != null)
        {
            while(root != null)
            {
                tree.add(root.val);
                nodes.push(root);
                root = root.left;
            }
            root = nodes.pop();
            root = root.right;
        }
        return tree;
    }
}