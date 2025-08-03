class Solution {
    public String makeFancyString(String s) {
        
        if (s.length() < 3) return s;
        
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 2; i < sb.length(); i++) {

            if (sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i-1) == sb.charAt(i-2)) {
                sb.delete(i-2, i-1);
                i--;
            }
        }

        s = sb.toString();
        return s;
    }
}