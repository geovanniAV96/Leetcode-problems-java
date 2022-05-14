class Solution {
    public boolean isPowerOfTwo(int n) {
        //We create a long to store the guess value
        long i = 1;
        //we loop until we get to n with our guessed number or we passe it in case is not a power of two
        while(i < n)
        {
            //now we calculate our guess multiplying by 2 until we reach n
            i *= 2;
        }
        //we return if i is equals to n, if is true that means we have a power of two
        return i == n;
    }
}