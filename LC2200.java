class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> kDistantIndices = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == key) {
                for (int j = Math.max(0, (i-k)); j<Math.min((nums.length), (i+k+1)); j++) {
                    if (!kDistantIndices.contains(j)) kDistantIndices.add(j);
                }
            }
        }

        return kDistantIndices;
    }
}

//Solved but needs optimization