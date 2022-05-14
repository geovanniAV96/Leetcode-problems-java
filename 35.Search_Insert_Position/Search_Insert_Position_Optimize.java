class Solution {
    public int searchInsert(int[] nums, int target) {
        //we need to create two pointers, left and right to do a binary search
        //The first time we use the whole array son we start at 0
        int l = 0;
        //And out right pointer should be at the end of the array
        int r = nums.length - 1;
        
        //We loop through the array until the left pointer is greater than the right one
        //This means that we didn't find any match
        while(l <= r)
        {
            //we get our middle pointer to compare our target with
            int midIndex = (l + r) / 2;
            //If we find a match in the middle pointer we return it
            if(nums[midIndex] == target)
            {
                return midIndex;
            }
            //If the middle value is greater than the target it means that the target is 
            //on the lenft side of the array
            else if(nums[midIndex] > target)
            {
                //so we move our right pointer to the left of the middle index
                r = midIndex - 1;
            }
            //if the middle value is less than the target that means the target is
            //on the right side
            else
            {
                //so we move our left pointer to the right of the middle index
                l = midIndex + 1;
            }
        }
        //if we din't find a match then the left pointer will be at the position where our target should be
        //to mantain the array sorted, because at the end we will update our right index(sencond if)
        //so it happens that our left pointer is at the correct position, so we return this value
        return l;
    }
    
}