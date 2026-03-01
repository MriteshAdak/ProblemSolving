class Solution {
    public int reverseBits(int n) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
        int sizeOfBinary = binary.length();
        binary.insert(0, "0".repeat(32 - sizeOfBinary));
        binary.reverse();
        Integer result = Integer.parseInt(binary.toString(), 2);
        return result;
    }
}