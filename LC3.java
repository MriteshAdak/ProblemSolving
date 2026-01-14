class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        java.util.Map<Character, Integer> charIndexMap = new java.util.HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(charIndexMap.get(currentChar) + 1, left);
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}