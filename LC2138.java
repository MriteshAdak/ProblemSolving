/*
 * 2138. Divide a String Into Groups of Size k
 *
 * A string s can be partitioned into groups of size k using the following procedure:
 * The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each element can be a part of * exactly one group.
 * For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
 * Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string * should be s.

 * Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above * procedure.
 */

class Solution {
    public String[] divideString(String s, int k, char fill) {

        int sl = s.length();
        int sizeOfOutputStringArray = (sl+k-1) / k;
        // System.out.println(sl);
        // System.out.println(sizeOfOutputStringArray);
        String[] result = new String[sizeOfOutputStringArray];
        
        for (int start = 0, end = k, index = 0;
            index < sizeOfOutputStringArray;
            start += k, end += k, index++) {

            // System.out.println(start + "\t" +  end + "\t" + index);
            if (end <= sl) {
                result[index] = s.substring(start, end);
                // System.out.println(result[index]);
            } else {
                String leftover = String.valueOf(fill).repeat(k - (sl%k));
                result[index] = s.substring(start).concat(leftover);;
                // System.out.println("Leftover: " + result[index]);
            }
        }

        return result;
    }
}