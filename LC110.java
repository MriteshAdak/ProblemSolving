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
        
        int depthOfLeftSubTree = calculateDepthOfBinaryTree(root.left);
        int depthOfRightSubTree = calculateDepthOfBinaryTree(root.right);

        return Math.abs(depthOfLeftSubTree - depthOfRightSubTree) <= 1;
    }

    private int calculateDepthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int depthOfTree = 0;
        Deque<TreeNode> queueOfNodes = new ArrayDeque<>();
        
        queueOfNodes.offer(root);
        
        while(!queueOfNodes.isEmpty()) {
            int queueSize = queueOfNodes.size();

            for(int i = 0; i < queueSize; i++) {
                TreeNode currentNode = queueOfNodes.poll();

                if(currentNode.left != null) queueOfNodes.offer(currentNode.left);
                if(currentNode.right != null) queueOfNodes.offer(currentNode.right);
            }
            depthOfTree++;
        }

        return depthOfTree;
    }
}

// Another failed attempt at solving the problem. Apparantly, I need clarification about what exactly is a heigth-balanced binary tree