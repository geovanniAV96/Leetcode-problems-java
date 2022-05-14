class Solution {
    public int singleNumber(int[] nums) {
        //First we use a variable to save the bits from the current number that we are checking
        int currentNum = 0;
        //Now we go through the array
        for(int i = 0; i < nums.length; i++)
        {
            //we need to turn on the bits of the current number and when we see that number we need to turn them off
            //to do that we use a xor to switch each bit
            currentNum ^= nums[i];
        }
        //at the end the only bits turn on are  going to be the ones of the number that only appears once
        //so we return that number
        return currentNum;
    }
}