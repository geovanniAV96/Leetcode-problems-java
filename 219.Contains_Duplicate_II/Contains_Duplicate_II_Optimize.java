class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //We need a hashmap to keep track of the number and its position
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        //Then we loop through the array 
        for(int i = 0; i < nums.length; i++)
        {
            //we use a variable to save the current number
            int current = nums[i];
            //now we have to check if we already saw the current number, if we did we have to check
            //if the difference between the current position and the last time we saw the current number
            //is less or equals to k
            if(seen.containsKey(current) && i - seen.get(current) <= k)
            {
                //we return true if this happens
                return true;
            }
            else
            {
                //else we add the current number to the hash map
                seen.put(current, i);
            }
        }
        //if we get to here that means we didn't saw two numbers with a distance less than k between them
        //so we return false
        return false;
    }
}