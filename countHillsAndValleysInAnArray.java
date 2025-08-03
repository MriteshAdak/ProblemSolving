class Solution {
    public int countHillValley(int[] nums) {
        int lengthOfNums = nums.length;
        int countOfHillsAndValleys = 0;
        
        for (int i = 2, left = nums[i-2]; i < lengthOfNums; i++) {

            int center = nums[i-1];
            int right = nums[i];

            if( (center > left && center > right) || 
                (center < left && center < right) ) {
                    countOfHillsAndValleys++;
            }

            if (center != left && center != right) {
                left = center;
            }
        }
        return countOfHillsAndValleys;
    }
}

//Solved