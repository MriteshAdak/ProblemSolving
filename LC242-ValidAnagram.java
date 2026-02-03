class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> count = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            Integer charCount = count.getOrDefault(c, 0);
            if(charCount == 0) return false;
            count.put(c, charCount - 1);
        }

        return true;
    }
}