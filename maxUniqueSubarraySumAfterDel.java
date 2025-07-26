class Solution {
    public int maxSum(int[] nums) {

        // check for negative integers, 0s and 1s, if no larger integer exists then return just the max
        int maxValue = Arrays.stream(nums).max().getAsInt();
        if(maxValue < 2) return maxValue;

        // creating a set for storing unique values from the array
        Set<Integer> maxSumSet = new HashSet<>();
        
        // only add positive integers to the set that will add to the sum
        for (int num : nums) if(num > 0) maxSumSet.add(num);

        return maxSumSet.stream().mapToInt(Integer::intValue).sum();
    }
}

//Solved