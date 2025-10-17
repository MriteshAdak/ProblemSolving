class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minVal) minVal = price;
            else maxProfit = Math.max(maxProfit, price - minVal);
        }

        return maxProfit;
    }
}

//Solved