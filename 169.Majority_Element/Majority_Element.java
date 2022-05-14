class Solution {
    public int majorityElement(int[] nums) {
        //if we receive an array with only 1 element we return that element
        if(nums.length == 1)
        {
            //return first element
            return nums[0];
        }
        //We need a hash map to keep track of each value and the number of times it appears
        HashMap<Integer, Integer> map = new HashMap<>();
        //We loop through the array
        for(int i: nums)
        {
            //we check if the current element's count is greater than half of the array
            //so if we already saw the current element and the number of visits plus the current one
            //is greater than half of the array, we return that element
            if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2)
            {
                //return current element
                return i;
            }
            else
            {
                //if we haven't see the current element or the count of visits is not greater than
                //the half of the array we add the element or just add 1 to the number of visits (value)
                //so we use the element as key and we use the method getOrDefault to use 0 when
                //we insert a new element + 1 or get the current value + 1 if the element already exists
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        //since the problem says the majority element always exist we should return inside the loop always
        //but java requires to return something after the loop so we return a -1
        return -1;
    }
}