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
        if(root == null || (root.left == null && root.right == null)) return true;

        int depthOfTree = 0;
        int countOfNodes = 0;

        Deque<TreeNode> queueOfNodes = new ArrayDeque<>();
        queueOfNodes.offer(root);

        while(!queueOfNodes.isEmpty()) {
            int queueSize = queueOfNodes.size();

            for(int i = 0; i < queueSize; i++) {
                TreeNode currentNode = queueOfNodes.poll();
                countOfNodes++;

                if(currentNode.left != null) queueOfNodes.offer(currentNode.left);
                if(currentNode.right != null) queueOfNodes.offer(currentNode.right);
            }
            depthOfTree++;
        }

        int maxDepthOfBalancedTree = (int) Math.floor(Math.log(countOfNodes) / Math.log(2)) + 1;
        return depthOfTree <= maxDepthOfBalancedTree;
    }
}