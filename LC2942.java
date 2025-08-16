/* 
 * 2942. Find Words Containing Character
 * 
 * You are given a 0-indexed array of strings words and a character x.
 * Return an array of indices representing the words that contain the character x.
 * Note that the returned array may be in any order.
 */

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arrOfIndices = new ArrayList<>();
        //converted to string beforehand just to check performance impact if we take it out of the loop.
        String xAsString = String.valueOf(x);
        
        for(Integer i = 0; i < words.length; i++) {
            if(words[i].contains(xAsString)) arrOfIndices.add(i);
        }

        return arrOfIndices;
    }
}

//Solved but too trivial