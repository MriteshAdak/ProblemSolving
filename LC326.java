/*
 * 326. Power of Three
 * 
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        double x = Math.log(n) / Math.log(3);
        return Math.abs(x - Math.round(x)) < 1e-10;
    }
}

//Solved with some help from Claude for taking care of some of the corner cases.