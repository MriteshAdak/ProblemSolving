/**
 * 108. Convert Sorted Array to Binary Search Tree
 * 
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 */

// Definition for a binary tree node.
public class TreeNode {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] numArr, int left, int right) {
        if(left > right) return null;
        
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(numArr[mid]);

        root.left = buildTree(numArr, left, mid-1);
        root.right = buildTree(numArr, mid+1, right);

        return root;
    }
}

//Solved