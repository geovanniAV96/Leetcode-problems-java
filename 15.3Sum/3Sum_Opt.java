class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        //First we need to create an array to store out triplets
        List<List<Integer>> output_arr = new ArrayList<>();
        //if we have an invalid input we return the empty array
        if(nums.length < 3) return output_arr;
        //then we sort our array so we can search for a sum, since the general performance of this
        //solution is O(n^2) it doesn't really matter if we use a built in function
        Arrays.sort(nums);
        //now we have to loop through the array without taking into account the last 2 elements
        //so we can check them on the second loop
        for(int i = 0; i < nums.length - 2; i++)
        {
            //now we need to check if we already saw the same number before or
            //if the number is 0
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1]))
            {
                //now we have to find a pair that its sum is equals to the negative of our current number
                //so we need to pointers, one at the start (after our current number)
                int low = i + 1;
                //and one at the end of the array
                int high = nums.length - 1;
                //also we need our target sum
                int sum = 0 - nums[i];
                //now we have to loop through the rest of the array (after our current number)
                while(low < high)
                {
                    //if we find a match
                    if(nums[low] + nums[high] == sum)
                    {
                        //we have to add that triplet to our list
                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        //if we have a duplicate next we ignore it for both pointers
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        //either way we need to move our pointers closer to each other
                        low++;
                        high--;
                    }
                    //in case we don't find a match we have to move our pointers, since the array is sorted
                    //if the sum is higher we need to move our high pointer backwards
                    else if(nums[low] + nums[high] > sum)
                    {
                        high--;
                    }
                    //if the sum is lower we need to move our low pointer forwards
                    else 
                    {
                        low++;
                    }
                }
            }
        }
        //finally we just return the array
        return output_arr;
    }
}