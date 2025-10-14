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
        
        if(root == null) return false;

        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        nodes.push(root);
        sums.push(root.val);

        while(!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            Integer sum = sums.pop();

            if(node.left == null && node.right == null && sum == targetSum) return true;

            if(node.right != null) {
                nodes.push(node.right);
                sums.push(sum + node.right.val);
            }
            if(node.left != null) {
                nodes.push(node.left);
                sums.push(sum + node.left.val);
            }
        }

        return false;
    }
}