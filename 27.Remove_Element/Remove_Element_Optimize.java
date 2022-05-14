class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        //if we receive an empty array we return 0, because that would be the length of the new array
        if(nums == null || nums.length < 1)
            return 0;
        //We create a variable to keep track of the size of the array with valid elements
        int valid_size = 0;
        //We loop through the array
        for(int i = 0; i < nums.length; i++)
        {
            //if we find an element that isn't val we swap it
            if(nums[i] != val)
            {
                nums[valid_size] = nums[i];
                //after we swap the element we have to increase the size of our arrray of valid elements
                valid_size++;
            }
        }
        //We return the size of the array of valid elements
        return valid_size;
        
    }
}