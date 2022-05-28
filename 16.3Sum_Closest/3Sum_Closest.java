class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++)
        {
            int currentValue = nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high)
            {
                int currentSum = nums[low] + nums[high] + currentValue;
                if(currentSum == target) return currentSum;
                if(currentSum > target)
                {
                    high--;
                }
                else
                {
                    low++;
                }
                if(Math.abs(currentSum - target) < Math.abs(sum - target))
                {
                    sum = currentSum;
                }
            }
        }
        return sum;
    }
}

