class Solution {
    public int majorityElement(int[] nums) {
        //Can be solved using Boyer-Moore's algorith
        //We set the first element as majority
        int major = nums[0];
        //Therefore we start our counter in 1
        int count = 1;
        //we loop through the array starting at position 1
        for (int i = 1; i < nums.length; i++)
        {
            //if we find an element that is equals to our current major we increment our counter
            if(major == nums[i])
            {
                //increment counter
                count++;
            }
            else
            {
                //if we find another number we decrease our counter
                count--;
            }
            //if our counter reach 0 that means we found an element that repeats the same times
            //as our current major and is pontentially our majority element
            if(count == 0)
            {
                //so we set it as our new major
                major = nums[i];
                //and we increment our count for that
                count++;
            }
        }
        //at the end the major is going to be the element that appears more times so we return it
        return major;
    }
}