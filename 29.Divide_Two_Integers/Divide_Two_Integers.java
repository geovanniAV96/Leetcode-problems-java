class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        int iteration = 0;
        
        while(dividend > 0)
        {
            if(divisor > 0)
            {
                dividend -= divisor;
                if(iteration == Integer.MAX_VALUE) return Integer.MAX_VALUE;
                iteration++;
            }
            else
            {
                dividend += divisor;
                if(iteration == Integer.MIN_VALUE) return Integer.MIN_VALUE;
                iteration--;
            }
        }
        if(iteration < 0)
        {
            return iteration + 1;
        }
        else
        {
            return iteration - 1;
        }
        
    }
}