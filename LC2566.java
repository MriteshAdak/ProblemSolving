/*
 * 2566. Maximum Difference by Remapping a Digit
 * 
 * You are given an integer num. You know that Bob will sneakily remap one of the 10 possible digits (0 to 9) to another digit.
 * Return the difference between the maximum and minimum values Bob can make by remapping exactly one digit in num.
 */

class Solution {
    public int minMaxDifference(int num) {
        List<Integer> digitsMaxRemap = new ArrayList<>();
        int maxNum = 0, minNum = 0;

        for(int factor = 10; num > 0; num /= 10) {
            int digit = num % factor;
            digitsMaxRemap.add(digit);
        }

        Collections.reverse(digitsMaxRemap);
        List<Integer> digitsMinRemap = new ArrayList<>(digitsMaxRemap);

        for(Integer n : digitsMaxRemap) {
            
            if(n < 9) {
                
                while(digitsMaxRemap.contains(n)) {
                    int index = digitsMaxRemap.indexOf(n);
                    digitsMaxRemap.set(index, 9);
                }
                break;
            }
        }

        for(Integer n : digitsMinRemap) {

            if(n > 0) {

                while(digitsMinRemap.contains(n)) {
                    int index = digitsMinRemap.indexOf(n);
                    digitsMinRemap.set(index, 0);
                }
                break;
            }
        }

        for(int i = (digitsMaxRemap.size() - 1), factor = 1; i >= 0 ; i--, factor *= 10) {
            maxNum += (digitsMaxRemap.get(i) * factor);
            minNum += (digitsMinRemap.get(i) * factor); 
        }

        return maxNum - minNum;
    }
}

//Solved but needs optimization