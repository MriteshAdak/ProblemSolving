import java.util.ArrayList;
import java.math.BigInteger;

class Solution {

    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for(int i=2; i<=num; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }

    private Integer calculateValue(int i, int j) {
        BigInteger numerator = factorial(i);
        BigInteger denominator = factorial(j).multiply(factorial(i-j));
        BigInteger result = numerator.divide(denominator);

        return result.intValue();
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        int rowMidIndex = (int)Math.floor(rowIndex/2);
        
        for(int i=0; i<=rowMidIndex; i++) {
            // Integer element = calculateValue(rowIndex, i);
            // row.add(element);
            row.add(calculateValue(rowIndex, i));
        }
        for(int i=rowIndex-rowMidIndex-1; i>=0; i--) {
            // Integer element(row.get(i));
            // row.add(element);
            row.add(row.get(i));
        }

        return row;
    }
}

//Sovled
//Runtime and Memory needs optimizations