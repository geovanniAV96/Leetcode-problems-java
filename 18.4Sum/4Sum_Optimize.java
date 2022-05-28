class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //This solution is very similar to 3Sum, we just need to add another loop for the new number
        //so the solution is going to be O(n^3)
        //First we need a List to save our resulting quadruplets
        List<List<Integer>> result = new ArrayList<>();
        //we can save the size to write less
        int size = nums.length;
        //then we check if our input is valid
        if(nums == null || size < 4)
        {
            return result;
        }
        //We need to sort the array, since this is a slow solution it doesn't really matter to add a sort (nlog(n))
        Arrays.sort(nums);
        //Now we need to loop through the array for the first element, since we have another 3 pointers left
        //we end in -3
        for(int i = 0; i < size - 3; i++)
        {
            //Then we need to check for duplicate values, except for the first iteration
            //if we find a duplicate we just skip that iteration
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            //we need to loop through the array after i to get the second value
            for(int j = i + 1; j < size - 2; j++)
            {
                //We also check here if we have duplicates, except for the first iteration
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                //now we need to get our pointers for the other 2 values
                int left = j + 1; 
                int right = size - 1;
                //and we loop until they cross 
                while(left < right)
                {
                    //then we get the current sum
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    //and we check if is equals to our target
                    if(sum == target)
                    {
                        //if it is we need to creat a list to save the current quadruplet
                        List<Integer> res = new ArrayList<>();
                        //and we add our current values to it
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        //then we add it to our result list
                        result.add(res);
                        //and we move both pointers since don't need to check any of them again
                        left++;
                        right--;
                        //then we check for duplicates for both pointers
                        while(left < right && nums[left] == nums[left - 1])
                        {
                            left++;
                        }
                        while(left < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }
                    }
                    //if the sum is less than the target that means we need to move our left pointer
                    else if(sum < target)
                    {
                        left++;
                    }
                    //and if it is greater we need to move our right pointer
                    else
                    {
                        right--;
                    }
                }
            }
        }
        //finally we just return our result list
        return result;
    }
}