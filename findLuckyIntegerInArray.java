import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int findLucky(int[] arr) {
        if(arr.length == 0) return -1;

        List<Integer> luckyList = new ArrayList<>();
        Set<Integer> setOfElementsInArr = Arrays.stream(arr).boxed().collect(Collectors.toSet());
       
        for(Integer n : setOfElementsInArr) {
            Integer count = 0;

            for(Integer k : Arrays.stream(arr).boxed().toArray(Integer[]::new )) {
                if(Objects.equals(n, k)) count++;
            }

            if(Objects.equals(count, n)) luckyList.add(n);
        }

        return luckyList.isEmpty() ? -1 : (int) Collections.max(luckyList);
    }
}

//Solved