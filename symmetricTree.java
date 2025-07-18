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
        //deleted the redundancies realted to null checks
        return equalTreeCheck(root.left, root.right);
    }
}

//Solved