import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(int args) {
        Solution run = new Solution();
        List<List<Integer>> triangle = run.generate(args);
        System.out.println(triangle);
    }
}

class Solution {

    private List<List<Integer>> pascalsTriangle = new ArrayList<>();

    private Integer calcualteValue(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            int value = pascalsTriangle.get(i-1).get(j-1) + pascalsTriangle.get(i-1).get(j);
            return value;
        }
    }

    public List<List<Integer>> generate(int numRows) {

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                Integer element = calcualteValue(i, j);
                row.add(element);
            }

            pascalsTriangle.add(row);
        }

        return pascalsTriangle;
    }
}

//Solved
//Significantly reduced runtime by a factor of 4