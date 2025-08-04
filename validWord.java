class Solution {
    private final List<Character> VOWELS = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean vowelExists = false;
        boolean consonenetExists = false;

        for (char ch : word.toCharArray()) {
            
            if(!(Character.isLetter(ch) || Character.isDigit(ch))) {
                return false;
            } else if (Character.isLetter(ch)) {
                
                if (VOWELS.contains(ch)) {
                    vowelExists = true;
                } else {
                    consonenetExists = true;
                }
            }
        }

        return vowelExists && consonenetExists;
    }
}

//Solved