/*
 * Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] <    * nums[j].

 * Return the maximum difference. If no such i and j exists, return -1.
 */

class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int numsLen = nums.lenght;

        for(int i = 0; i < (numsLen - 1); i++) {
            for(int j = (i + 1); j < numsLen; j++) {
                if(nums[j] > nums[i]) {
                    maxDiff = Math.max(maxDiff, (nums[j] - nums[i]));
                }
            }
        }

        return maxDiff;     
    }
}

//Solved