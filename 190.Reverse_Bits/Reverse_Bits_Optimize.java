public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //First we creat a variable to store our result
        int result = 0;
        //then we loop through our number
        for(int i = 0; i < 32; ++i)
        {
            //We shift our number to the left by 1 bit with this we are going to reverse the
            //final number as we go
            //example: 00000010100101000001111010011100
            //         00000101001010000011110100111000
            result <<=1;
            //Now we use n & 1 to check if the last bit is 1 or 0
            //if we have a 0 we dont do anything and if we have a 1 we added to the result
            //example: 00000000101001010000011110100111
            //returns  00000000000000000000000000000001 so we add 1 to result:
            //         00000000000000000000000000000001
            if((n & 1) > 0) result++;
            //then we shift to the right to be able to check the next number
            //example: 00000000101001010000011110100111
            //         00000000010100101000001111010011
            n >>= 1;
        }
        //When we are done we will have the number reversed so we returned
        return result;
    }
}



