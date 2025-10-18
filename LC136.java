import java.util.HashMap;

class LC136 {
    public static void main(String args[]) {
        Solution singleNumber = new Solution();
        int[] testCase = {1,2,2,3,4,1,3};
        System.out.println(singleNumber.singleNumber(testCase));
    }
}


class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> countTable = new HashMap<>();
        
        for(int num : nums) {
            countTable.put(num, countTable.getOrDefault(num, 0) + 1);
        }

        for(Integer key : countTable.keySet()) {
            if(countTable.get(key) == 1) return (int) key;
        }
        
        return 0;
    }
}