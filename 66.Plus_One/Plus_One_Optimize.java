class Solution {
    public int[] plusOne(int[] digits) {
        // First we create a new variable to store the length of digits
        int digitsLength = digits.length;
        // We are going to loop backwards through the array
        for(int i = digitsLength - 1; i >= 0; i--)
        {
            // if we find a number that is not 9
            if(digits[i] < 9)
            {
                // we just add one to it
                digits[i]++;
                // and we are finish so we return digits
                return digits;
            }
            // if we find a 9 we just have to convert it to 0
            digits[i] = 0;
        }
        // if we get here that means we have only 9's in the array, if thats the case
        // we have to create a new array because for example 999 + 1 = 1000, it adds
        // an extra digit to the number so we need a bigger array
        int[] new_number = new int[digitsLength + 1];
        // the first number of this array always will be 1 
        new_number[0] = 1;
        // with that we are finished so we return the new array
        return new_number;
    }
}