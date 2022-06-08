class Solution {
    public int divide(int dividend, int divisor) {
        //To solve this problem we are going to use bit shifting
        //so first we need to check one of our edge cases, when we have a quotient greater than 2^31 - 1
        //so we need to take care of that and return MAX_VALUE
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
        //Then we need to check the sign of the quotient using the law of signs
        boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
        //then we get the absolute value of the dividend and the divisor
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        //we need to create a variable to stor the quatient
        int result = 0;
        //now we have to loop until the substraction of the divisor from the dividend is < 0
        while(dividend - divisor >= 0)
        {
            //we need to keep track of every time we duplicate the divisor
            int count = 0;
            //and now we have to check how many times we duplicate the divisor until the divisor is less than 0
            while(dividend - (divisor << 1 << count) >= 0)
            {
                //if we can substract we add to the count
                count++;
            }
            //after that we add the current count of times we duplicate to the result
            result += 1 << count;
            //then we substract the value of times we duplicate in this iteration to the dividend
            dividend -= divisor << count;
        }
        //finally we just return the result depending of the sign we calculate at the start
        return sign ? result : -result;
    }
}