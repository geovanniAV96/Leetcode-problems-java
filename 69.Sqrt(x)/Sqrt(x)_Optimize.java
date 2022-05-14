class Solution {
    public int mySqrt(int x) {
        //If we receive 1 or 0 we return the same input
        if (x < 2) return x;
        //We create or two pointers for the start and finish, since we are working with big numbers
        //we have to use long and cast it to int before returning 
        long start = 1;
        long finish = x;
        //We loop to make our binary search
        while(start < finish)
        {
            //Then we need to create a variable to calculate the middle
            long middle = start + (finish - start) / 2;
            //Now if our middle square is equals to the middle we return the middle 
            //because we found a exact root square
            if(middle * middle == x)
            {
                return (int)middle;
            }
            //if the middle square is greater than our input we set the middle as our new finish
            else if(middle * middle > x)
            {
                finish = middle;
            }
            //if the middle square is less than our input we set the middle + 1 as our new start
            else if(middle * middle < x)
            {
                start = middle + 1;
            }
        }
        //if we didn't find a match in the loop that means our square root is not exact so we return
        //the nearest value, in this case is the start - 1
        return (int)start - 1;
    }
}