
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMapping = new TreeMap<>();
        for (int n : nums) frequencyMapping.put(n, frequencyMapping.getOrDefault(n, 0) + 1);

        int max = 0;
        for(Integer num : frequencyMapping.keySet()) {
            if (frequencyMapping.containsKey(num + 1)) {
                int combinedLength = frequencyMapping.get(num) + frequencyMapping.get(num + 1);
                max = Math.max(combinedLength, max);
            }
        }
        return max;
    }
}