class LC125 {
    public static void main(String args[]) {
        Solution run = new Solution();
        boolean isPalindrome = run.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome);
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String filteredString = s.replaceAll("[^A-Za-z0-9]","");
        filteredString = filteredString.toLowerCase();
        System.out.println(filteredString);

        int left = 0;
        int right = filteredString.length() - 1;
        
        while(left < right) {
            if(filteredString.charAt(left) != filteredString.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}

//Solved