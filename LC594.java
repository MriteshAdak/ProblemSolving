class Solution {
    public int findLHS(int[] nums) {
        List<Integer> uniqueValuesInArray = new ArrayList<>();
        Map<Integer, Integer> mapOfNumbersAndTheirCountInArray = new TreeMap<>();

        for (int n : nums) {
            if (!uniqueValuesInArray.contains(n)) uniqueValuesInArray.add(n);
        }
        uniqueValuesInArray.sort(null);
        // System.out.println(uniqueValuesInArray);

        if(uniqueValuesInArray.size() <= 2) {
            // System.out.println("too small");
            if(uniqueValuesInArray.size() <= 1 || !uniqueValuesInArray.get(1).equals(uniqueValuesInArray.get(0)+1))
                return 0;
            else
                return nums.length;
        }

        for (Integer n : uniqueValuesInArray) {
            Integer count = 0;
            for (int k : nums) if (k == n) count++;
            mapOfNumbersAndTheirCountInArray.put(n, count);
        }

        // System.out.println(mapOfNumbersAndTheirCountInArray);
        
        int max = 0;
        for (int i = 1; i < uniqueValuesInArray.size(); i++) {
            // System.out.println(uniqueValuesInArray.get(i).equals(uniqueValuesInArray.get(i-1)+1));
            // System.out.println(uniqueValuesInArray.get(i));
            // System.out.println(uniqueValuesInArray.get(i-1)+1);
            if(uniqueValuesInArray.get(i).equals(uniqueValuesInArray.get(i-1)+1)) {
                int combinedCount = mapOfNumbersAndTheirCountInArray.get(uniqueValuesInArray.get(i)) + 
                                    mapOfNumbersAndTheirCountInArray.get(uniqueValuesInArray.get(i-1));

                // System.out.println(combinedCount);
                if (combinedCount > max) max = combinedCount;
            }
        }
        return max;
    }
}