class Solution {
    public int titleToNumber(String columnTitle) {
        //We create a variable to store our sum
        int result = 0;
        //we loop through the string
        for(char c : columnTitle.toCharArray())
        {
            //We get the ASCII value of the current character and we converted to a scale from 1
            //where A is 1 and Z is 26
            int d = c - 'A' + 1;
            //here we use this formula to get the result, we use the current sum and we multiply
            //for 26 which is the ASCII value of Z plus the current value, this works like a
            //power function of sorts to get the value until the current position since
            //each position should be elevated to a grater power, doing this we get the same result
            //with less steps
            result = result * 26 + d;
        }
        //Finally we return the final sum
        return result;
    }
}