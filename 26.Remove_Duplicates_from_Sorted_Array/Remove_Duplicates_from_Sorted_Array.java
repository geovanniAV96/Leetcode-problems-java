class Solution {
    public int removeDuplicates(int[] nums) {
        //if we receive an empty array we just return 0
        if(nums == null || nums.length == 0)
            return 0;
        //We need 2 indexes to travel through the array, one of them should be faster
        //we create j as the slower index
        int j = 0;
        //in this case we are going to make i faster so it should be inside a for loop
        for(int i = 0; i < nums.length; i++)
        {
            //we need to advance i until we find different elements for each index
            if(nums[i] != nums[j])
            {
                //if we find different elements we need to advance j
                j++;
                //then we have to swap the elements to keep the array sorted and without duplicates
                //because we only need the starter elements of the array we need to move the element 
                //more to the right to the left, because i is the faster index we use that to get
                //the element and assigned it to the left index (slower) in this case j
                nums[j] = nums[i];
            }
        }
        //we need to return the length of the array with no duplicates, for that we return the 
        //slower index + 1 to get the length
        return j + 1;
    }
}