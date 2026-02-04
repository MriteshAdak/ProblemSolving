import java.util.*;

/**
 * Solution for LeetCode Problem 78
 * Time Complexity:
 * Space Complexity:
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Empty case
        if(nums == null && nums.length < 1) {return result;}

        backtrack(nums, new ArrayList<>(), result, 0);

        return result;
    }

    private void backtrack(int[] input, List<Integer> currentList, List<List<Integer>> result, int startIndex) {
        result.add(new ArrayList<>(currentList));
        int size = currentList.size();
        
        for(int i=startIndex; i<input.length; i++) {
            currentList.add(input[i]);
            backtrack(input, currentList, result, i+1);
            currentList.remove(currentList.size() - 1);
        }
    }
}