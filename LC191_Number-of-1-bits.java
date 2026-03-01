class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        int size = binary.length();
        for (int i  = 0; i < size; i++) {
            if (binary.charAt(i) != '0') count++;
        }

        return count;
    }
}