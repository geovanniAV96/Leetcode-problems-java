class Solution {
    public int climbStairs(int n) {
        //First we need to create an array to save our answers and have our base cases
        int[] waysToClimb = new int[n + 1];
        //because we know how many ways there are to climb 0
        waysToClimb[0] = 1;
        //and 1 steps which is 1
        waysToClimb[1] = 1;
        //Now we have to figure out the possible ways to climb the stair using our base cases
        //to do this we loop from 2, which is the first step that we dont know how to solve, until we reach n
        for(int i = 2; i <= n; i++)
        {
            //to calculate our next steps we know that we could have come the previous step or the two steps before
            //an when we calculate the next step we'll always have the previous two calculated to solve it
            waysToClimb[i] = waysToClimb[i - 1] + waysToClimb[i - 2];
        }
        //Then we just return the value that we calculated for n
        return waysToClimb[n];
    }
}