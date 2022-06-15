class Solution {
    public void nextPermutation(int[] nums) {
        //We want to search in pairs so we need to account for than in our pointer
        //and we want to start at the end of the array, so lengrth - 2
        int i = nums.length - 2;
        //so we need to find the point where the sequence starts decreasing
        //to do that we loop until we find an element that is less than its left neighbor
        while(i >= 0 && nums[i] >= nums[i+1])
        {
            //here we just move the pointer to the left until we find an element that is decreasing
            i--;
        }
        //if i isn't at the start of the array
        if(i >= 0)
        {
            //we get a pointer of the element at the end of the array
            int j = nums.length - 1;
            //and we loop to find an element greater than the ith element
            while(j >= 0 && nums[i] >= nums[j])
            {
                //meanwhile we just move our pointer to the left
                j--;
            }
            //when we find it we swap both elements, because we know that there is going to be the next permutation
            swap(nums, i, j);
        }
        //after that we have to reverse the array after the element that we just swap, to complete the next permutation
        reverse(nums, i + 1);
    }
    //This method is used to reverse a section of an array, from start tah we passed to the end of the array
    private void reverse(int[] nums, int start)
    {
        //so first we get a pointer to the last element
        int j = nums.length - 1;
        //and we loop while they don't cross each other with the start
        while(start < j)
        {
            //then we start swaping the element on the left with the element on the right
            swap(nums, start, j);
            //and we keep moving outwards for the start pointer
            start++;
            //and inwards for the j pointer
            j--;
        }
    }
    //We are going to use this method just to swap two elements in the array
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}