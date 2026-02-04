import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 * Solution for Leetcode #46: Permutations
 * Time Complexity: O(n * n!)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int lenghtOfInput = nums.length;

        // Empty case
        if(nums != null && lenghtOfInput < 1) return result;
        

        boolean[] used = new boolean[lenghtOfInput];

        backtrack(nums, new ArrayList<Integer>(), used, result);

        return result;
    }

    private void backtrack(int[] input, List<Integer> currentList, boolean[] used, List<List<Integer>> result) {
        int lenghtOfInput = input.length;
        if(currentList.size() == lenghtOfInput) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=0; i < lenghtOfInput; i++) {

            if(used[i]) {continue;}

            used[i] = true;
            currentList.add(input[i]);

            backtrack(input, currentList, used, result);

            currentList.remove(currentList.size() - 1);
            used[i] = false;
        }
    }
}