class Solution {
    public boolean isPalindrome(int x) {
        // you can read 0 from left to right and viceversa and is the same
        if(x == 0)
        {
            return true;
        }
        
        // a negative number can never be a palindrome
        // a number that end in 0 can never be a palindrome (10,20,30,40)
        if(x < 0 || x % 10 == 0)
        {
            return false;
        }
        
        int reversed_int = 0;
        //until we get the half reversed
        while(x > reversed_int)
        {
            //we get the last digit
            int pop = x % 10;
            //we 'pop' the last digit
            x /= 10;
            
            //we 'paste' x's last digit to reversed_int
            //first we add a 0 to the end of reversed_int
            //then we add the last digit in x to reversed_int
            reversed_int = (reversed_int * 10) + pop;
        }
        
        //We check if both halfs are equals or if we have an odd number
        //we 'pop' the middle number and compare the resulted halfs
        if(x == reversed_int || x == reversed_int / 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}