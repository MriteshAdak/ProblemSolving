/*
 * 231. Power of Two
 * 
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */


class Solution {
    public boolean isPowerOfTwo(int n) {
        double x = Math.log(n) / Math.log(2);
        return Math.abs(x - Math.round(x)) < 1e-10;
    }
}

//Solved
//Same logic from LC326.java