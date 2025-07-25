import java.util.ArrayDeque;
import java.util.Deque;

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

    public int maxDepth(TreeNode root) {

        //return root == null ? 0 : (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);

        if(root == null) return 0;

        int depth = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {

            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {

                TreeNode currentNode = queue.poll();
            
                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }
            depth++;
        }
        return depth;
    }
}

//Solved