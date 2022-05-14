class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        
        int smaller = 0;
        
        int i = 0;
        int j = 1;
        while(i < prices.length - 1 && j < prices.length - 1)
        {
            if(prices[j] < prices[i])
            {
                smaller = j;
                i++;
            }
            else
            {
                smaller = i;
                j++;
            }
        }
        System.out.println(smaller);
        if(smaller < prices.length - 1)
        {
            int greaterSum = 0;
            for(int k = smaller + 1; k < prices.length; k++)
            {
                int currentSum = prices[k] - prices[smaller];
                if(currentSum > greaterSum)
                {
                    greaterSum = currentSum;
                }
            }
            return greaterSum;
        }
        else
        {
            return 0;
        }
    }
}