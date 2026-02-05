class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Empty case
        if(candidates == null || candidates.length == 0) return result;

        Arrays.sort(candidates);
        backtrack(candidates, target, result, new ArrayList<>(), 0);

        return result;
    }

    private void backtrack(int[] inputs, int remaining, List<List<Integer>> result, List<Integer> currentList, int startIndex) {
        // Combination found
        if(remaining == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        // Continue on with the loop
        for(int i = startIndex; i < inputs.length; i++) {

            // Input bigger than the remaining buffer
            if(inputs[i] > remaining) {
                break;
            }

            currentList.add(inputs[i]);

            backtrack(inputs, remaining - inputs[i], result, currentList, i);

            currentList.remove(currentList.size() - 1);
        }
    }
}