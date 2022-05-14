class Solution {
    public int maxProfit(int[] prices) {
        //We create a variable to save the max difference we have between each value for the profit
        int max = 0;
        //then we create a variable to store the min value in the array as the maximum value for an integer
        int min = Integer.MAX_VALUE;
        //Now we iterate through the prices array
        for(int i = 0; i < prices.length; i++)
        {
            //if the current value is less than our actual min
            if(prices[i] < min)
            {
                //we set it as out min value
                min = prices[i];
            }
            else
            {
                //else we take the max value between our current max and the difference between our current min
                //and our current value in the array
                max = Math.max(max, prices[i] - min);
            }
        }
        //finally we return the max value
        return max;
    }
}