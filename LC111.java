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
        public int minDepth(TreeNode root) {
            if(root == null) return 0;

            int leftHalf = calculateMinDepthOfBTree(root.left);
            int rightHalf = calculateMinDepthOfBTree(root.right);

            if(leftHalf > 1 && rightHalf > 1) return Math.min(leftHalf, rightHalf);
            else return Math.max(leftHalf, rightHalf);
        }

        private int calculateMinDepthOfBTree(TreeNode root) {
            if(root == null) return 1;

            int depth = 1;
            Deque<TreeNode> queueOfNodes = new ArrayDeque<>();

            queueOfNodes.offer(root);

            outer:
            while(!queueOfNodes.isEmpty()) {
                int queueSize = queueOfNodes.size();
                
                for(int i=0; i<queueSize; i++) {
                    TreeNode currentNode = queueOfNodes.poll();

                    if(currentNode.left == null && currentNode.right == null) {
                        depth++;
                        break outer;
                    }

                    if(currentNode.left != null) queueOfNodes.offer(currentNode.left);
                    if(currentNode.right != null) queueOfNodes.offer(currentNode.right);
                }

                depth++;
            }

            return depth;
        }
    }