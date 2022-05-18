class Solution {
    public int myAtoi(String s) {
        //We need a variable to store the result, we are going to use a double
        //just in case the input is to big so we can handle that case
        double result = 0;
        //we also need variables to handle positive and negative sign
        boolean isNegative = false;
        //we need another variable to know the index of the first numerical character
        //so we can start our loop there
        int startIndex = 0;
        //First we need to remove whitespaces from the input
        s = s.trim();
        //Then we have to check if our result input is valid
        if(s == null || s.length() == 0) return 0;
        //since we trim the string we can check if the first element is a sign
        //first we check if is a positive sign
        if(s.charAt(0) == '+' || s.charAt(0) == '-')
        {
            //we have to move our starting index
            startIndex++;
        }
        //then we check if is a negative sign
        if(s.charAt(0) == '-')
        {
            //if it is we change our boolean to true
            isNegative = true;
        }
        
        //Now we loop through the string
        for(int i = startIndex; i < s.length(); i++)
        {
            //here we need to handle non numerical characters
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
            {
                break;
            }
            //We can get the value of the current digit using its ASCII value
            //doing a substraction with '0' we can get the value of the digit
            //since the ASCII value of '0' is 0
            int digitValue = (int)(s.charAt(i) - '0'); // example: '9' - '0'
            //now we add each digit to the result, to get the right sum 
            //we have to multiply each time by 10 so we can get the right value
            //and its correct position
            result = result * 10 + digitValue;
        } 
        //if at the start we had a negative sign we have to make our result negative
        if(isNegative)
        {
            result = -result;
        }
        //we also need to check if the number is out of bounds for an integer value
        //if it's greater than the upper value we return the max value
        if(result > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        //if it's less than the lower value we return the min value
        if(result < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        //to return we have to cast our double to an int
        return (int)result;
        
    }
}