class Solution {
    public int maxSum(int[] nums) {

        int maxValue = Arrays.stream(nums).max().getAsInt();
        if(maxValue < 2) return maxValue;

        Set<Integer> maxSumSet = new HashSet<>();
        
        for (int num : nums) if(num > 0) maxSumSet.add(num);

        return maxSumSet.stream().mapToInt(Integer::intValue).sum();
    }
}

//Solved