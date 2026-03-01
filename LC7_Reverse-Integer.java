class Solution {
    public int reverse(int x) {
        
        if (x == 0) return 0;

        try {
            int temp = Math.abs(x);
            String reverse = "";
            
            while (temp > 0) {
                reverse += temp % 10;
                temp = (int) temp / 10;
            }

            int result = Integer.parseInt(reverse);

            if (x < 0) result = -result;

            return result;
        }
        catch (NumberFormatException n) {
            return 0;
        }
    }
}