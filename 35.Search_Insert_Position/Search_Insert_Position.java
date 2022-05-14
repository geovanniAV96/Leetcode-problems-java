class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    public int binarySearch(int[] nums, int start, int finish, int target)
    {
        int middle = start + (finish - start) / 2;
        boolean bigger = false;
        if(finish >= start)
        {
            if(target == nums[middle])
                return middle;
            if(target < nums[middle])
            {
                bigger = false;
                return binarySearch(nums, start, middle - 1, target);
            }
            if(target > nums[middle])
            {
                bigger = true;
                return binarySearch(nums, middle + 1, finish, target);
            }
        }
        else if(bigger)
        {
            return middle + 1;
        }
        return middle;
    }
}