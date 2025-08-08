class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {

            StringBuilder generatedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char shiftedChar;
                if ((int) word.charAt(i) == 122 || (int) word.charAt(i) == 90) {
                    shiftedChar = (char) (word.charAt(i)-25);
                } else {
                    shiftedChar = (char) (word.charAt(i)+1);
                }
                generatedWord.append(shiftedChar);
            }
            word.append(generatedWord);
        }
        return word.charAt(k-1);
    }
}

//Solved