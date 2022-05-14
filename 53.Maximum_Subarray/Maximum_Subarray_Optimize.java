class Solution {
    public int maxSubArray(int[] nums) {
        //we need to create a variable to save our max sum value and we are going to set it 
        //to the first value of the array
        int max_sum = nums[0];
        //At first this is going to be our current sum so we need a variable to save that value
        int current_sum = max_sum;
        //Now we need to loop through the array, starting from the second element
        for(int i = 1; i < nums.length; i++)
        {
            //We are going to generate subarrays to compare, we already have the first element
            //so we need to check the next element and compare it with the sum of the current element
            //and our current sum which is the previous elementS
            //If we have [-2,2,5,-11,6] then max_sum = -2 and nums[i] = 2, because 2 is greater we set that
            //as out current sum and max sum, then nums[i] = 5, we check if the current array(current_sum) = 7
            //is greater than the current element = 5 to decide whether we want to start a new array [5] or we
            //continue we our current sum [2,5] and we repeat this until the end of the array
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            //if the current sum is greater than the max sum we just update our max sum
            max_sum = Math.max(current_sum, max_sum);
        }
        //Finally we just return our max sum
        return max_sum;
    }
}