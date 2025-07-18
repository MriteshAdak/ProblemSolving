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

    private boolean equalTreeCheck(TreeNode tree1, TreeNode tree2) {
        
        if(tree1 == null && tree2 == null) {
            return true;
        }
        
        if(tree1 == null || tree2 == null) {
            return false;
        }
        //A slight tweak to the standard inOrderTraversal because the symmetry has to be checked
        return (tree1.val == tree2.val &&
                equalTreeCheck(tree1.left, tree2.right) &&
                equalTreeCheck(tree1.right, tree2.left)
        );
    }

    public boolean isSymmetric(TreeNode root) {
        // Initial check to handle null pointer exceptions before the two halfs of the tree are divided
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        } else if (root.left == null || root.right == null) {
            return false;
        } else { //dividing the tree into 2 halfs and chekcing for equality
            TreeNode leftTreeNode = root.left;
            TreeNode rightTreeNode = root.right;
            return equalTreeCheck(leftTreeNode, rightTreeNode);
        }
    }
}

//Solved