public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //We create a variable to save the final weight
        int weight = 0;
        //we loop while we have at least a 1 in n 
        while(n != 0)
        {
            //if we don't have an even number that means we have a one at the end
            //so when that happens we add 1 to the weight
            weight += (n % 2) & 1;
            //after that we shift the bits to the left, using >>> we make sure to
            //add a 0 to the left after we shift, if don't we are going to keep looping infinitely 
            n >>>= 1;
        }
        //when we are done we can return
        return weight;
    }
}