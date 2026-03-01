class Solution {
    public String convertToTitle(int columnNumber) {
        // Basically build a Base 26 Integer, sort of
        StringBuilder column = new StringBuilder();
        int iterator = columnNumber;

        while (iterator > 0) {
            iterator--;
            int remainder = iterator % 26;
            char columnLetter = (char) (remainder + 65); // ASCII equivalent
            column = column.append(columnLetter);
            iterator = (int) (iterator / 26) ;
        }

        return column.reverse().toString();
    }
}