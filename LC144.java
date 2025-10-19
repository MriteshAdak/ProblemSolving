import java.util.ArrayList;
import java.util.List;

public class LC144 {
    public static void main(String args[]) {
        Solution result = new Solution();
        // System.out.println(result.preorderTraversal());
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    
    private List<Integer> preOrderTraversed = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrderTraverse(root);
        return preOrderTraversed;
    }

    private void preOrderTraverse(TreeNode node) {
        if(node == null) return;

        preOrderTraversed.add(node.val);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}

//Solved