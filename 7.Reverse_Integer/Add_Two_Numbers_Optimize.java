class Solution {
    public int reverse(int x) {
        // We need a variable to store the answer
        int reversed = 0;
        // We need another variable to store the current last digit
        int pop;
        //Now we have to loop through each character of the integer
        while(x != 0)
        {
            //We get the last digit of the integer
            pop = x % 10;
            //and we eliminate it from the integer
            x /= 10;
            //Now we check the boundaries of the integer, just in case we can't store it in an integer
            //we have to check before we get to the number we can't store so we divide by 10 or
            //we check if the current value is equals to the max value divided by 10 and
            //since 2,147,483,647 is the max integer we can store we also have to check that the last value 
            //isn't more than 7
            if(reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) return 0;
            //we have to do the same for the minimum value we can store in an integer but the minumum value
            //is -2,147,483,648 so we have to check for that -8 also
            if(reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && pop < -8) return 0;
            //and we add the current last digit to the answer
            reversed = (reversed * 10) + pop;
        }
        //Finally we return the reversed integer 
        return reversed;
    }
}