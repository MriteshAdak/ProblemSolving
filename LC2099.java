/*
2099. Find Subsequence of Length K With the Largest Sum
You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
*/

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        //In case k is equal to the array size then return the arrays as is
        if(nums.length == k) return nums;

        //Converting the array to a List to modify the collection
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int elementsToRemove = numsList.size() - k;

        for (int i=0; i< elementsToRemove; i++) {
            numsList.remove(Integer.valueOf(Collections.min(numsList)));
        }
        
        //Converting the List back to int[] to match the required return type
        int[] maxSubSequenceFromArray = numsList.stream().mapToInt(Integer::valueOf).toArray();
        return maxSubSequenceFromArray;
    }
}

//Solved