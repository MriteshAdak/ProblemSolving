import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

class Solution {
    
    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private Integer calcualteValue(int i, int j) {
        BigInteger numerator = factorial(i);
        BigInteger denominator = factorial(j).multiply(factorial(i-j));
        BigInteger result = numerator.divide(denominator);
        
        return result.intValue();
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

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
//But runtime is very high