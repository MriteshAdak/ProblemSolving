class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int maxFreq = 0;
        int result = nums[0];
        HashMap<Integer, Integer> mapOfFrequencies = new HashMap<>();

        for (int n : nums) {
            // int currentCount = mapOfFrequencies.getOrDefault(n, 1);
            mapOfFrequencies.put(n, mapOfFrequencies.getOrDefault(n, 0) + 1);
        }

        for (int n : mapOfFrequencies.keySet()) {
            int val = mapOfFrequencies.get(n);
            if (val > maxFreq) {
                maxFreq = val;
                result = n;
            }
        }

        return result;
    }
}