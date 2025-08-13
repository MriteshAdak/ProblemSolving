/* 
You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.

Return a list of all k-distant indices sorted in increasing order.
*/

import java.util.List;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> kDistantIndices = new ArrayList<>();
        //Using toBeAdded to prevent dulpicates in the final list
        //Sets can be used but then they have to be transformed to a List
        //and also will have to be sorted increasing runtime
        boolean[] toBeAdded = new boolean[nums.length];

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == key) {
                for (int j = Math.max(0, (i-k)); j < Math.min((nums.length), (i+k+1)); j++) {
                    toBeAdded[j] = true;
                }
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (toBeAdded[i]) kDistantIndices.add(i);
        }

        return kDistantIndices;
    }
}

//Solved