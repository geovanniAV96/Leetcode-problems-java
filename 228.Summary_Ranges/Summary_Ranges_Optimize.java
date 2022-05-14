class Solution {
    public List<String> summaryRanges(int[] nums) {
        //We need a list to store our result
        ArrayList<String> ranges = new ArrayList<>();
        //We can store the length of the array in a variable
        int arrayLength = nums.length;
        //If the length of the array is 0 we can return the empty list since there is no ranges
        if(arrayLength == 0) return ranges;
        //we know that the first element of the array is the lowest so we can store it as the lowest element
        int lowest = nums[0];
        //Now we can loop through the array
        for(int i = 0; i < arrayLength; i++)
        {
            //We can check if we are on the last position or if we find a non consecutive value
            //that happens when the current number + 1 is different than the next number
            //example: 0, 1,    3, 4
            if(i == arrayLength - 1 || nums[i] + 1 != nums[i + 1])
            {
                //now we can check if the current number is different than our lowest
                //that means we have a range from lowest to current position
                if(nums[i] != lowest) 
                {
                    //if that happens we add it to the list with an arrow
                    ranges.add(lowest + "->" + nums[i]);
                }
                else
                {
                    //if that's not true it means we have only one element in our range
                    //so we have to add the element without a pair and without the arrow
                    ranges.add(lowest + "");
                }
                //If we are not at the last element of the array
                if(i != arrayLength - 1)
                {
                    //since we already save the current range we have to move to the next one
                    //to do that we have to move our lowest to the next element
                    lowest = nums[i + 1];
                }
            }
        }
        //once we are out of the loop we can just return the list with all the ranges
        return ranges;
    }
}