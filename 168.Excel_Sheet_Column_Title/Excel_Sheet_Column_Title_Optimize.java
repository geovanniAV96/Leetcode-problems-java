import java.lang.Math;
class Solution {
    public String convertToTitle(int columnNumber) {
        //First we create a string builder to save our answer
        StringBuilder res = new StringBuilder();
        //we loop through until we don't have anything else to calculate
        while(columnNumber > 0)
        {
            //we convert the values of each character to one less so A is 0 and Z is 25 instead of 1 and 26 respectively
            columnNumber--;
            //We get the last character of the string by getting the residue and add 65 (A position in ASCII)
            char toAdd = (char)((columnNumber % 26) + 65);
            //we insert the character that we got into the start of the string because we are getting the values
            //from right to left
            res.insert(0, toAdd);
            //to get the next value we divide by 26 (letters in the alphabet)
            columnNumber /= 26;
        }
        //Finally we return the string
        return res.toString();
    }
}