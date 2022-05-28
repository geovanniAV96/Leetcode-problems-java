class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Firt we save our first posible sum just to get a number that is posible in this array
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        //then we sort our array
        Arrays.sort(nums);
        //Now we loop through the array leaving the last 2 elements so we can have at least 3 elements at the end
        for(int i = 0; i < nums.length - 2; i++)
        {
            //we need a pointer to the element after the current one
            int a_pointer = i + 1;
            //and another one for the element at the end
            int b_pointer = nums.length - 1;
            //This will help us looping through the rest of the array and find our next posible sum
            while(a_pointer < b_pointer)
            {
                //now we get our current posible sum using our three pointers
                int current_sum = nums[i] + nums[a_pointer] + nums[b_pointer];
                //since our array is sorted we can check if the current sum is greater than the target
                //if it is we can move our left pointer to the right
                if(current_sum > target)
                {
                    b_pointer -= 1;
                }
                // else we have to move our left pointer to the right
                else
                {
                    a_pointer += 1;
                }
                //now we check if the current sum is closest to the target than our last closes sum
                if(Math.abs(current_sum - target) < Math.abs(result - target))
                {
                    //if it is closer we change our result with our closest sum
                    result = current_sum;
                }
            }
        }
        //finally when we are finished we can return our result
        return result;
    }
}

