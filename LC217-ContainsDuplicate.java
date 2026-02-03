class Solution {
    public boolean containsDuplicate(int[] nums) {
        int arrLength = nums.length;
        Set<Integer> dupChecker = new HashSet<Integer>();

        for(int num : nums) {
            if(dupChecker.contains(num)) {
                return true;
            }
            else {
                dupChecker.add(num);
            }
        }
        return false;
    }
}