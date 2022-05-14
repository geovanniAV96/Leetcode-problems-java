class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ranges = new ArrayList<>();
        if(nums.length <= 0) return ranges;
        int lower = 0;
        if(nums.length == 1)
        {
            ranges.add(nums[lower] + "");
            return ranges;
        } 
        int higher = 0;      
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[higher] + 1 == nums[i])
            {
                higher = i;
            }
            else
            {
                if(lower != higher)
                {
                    ranges.add(nums[lower] + "->" + nums[higher]);
                }
                else
                {
                    ranges.add(nums[lower] + "");
                }
                lower = i;
                higher = i;
            }
            if(i == nums.length - 1)
            {
                if(higher == lower)
                {
                    ranges.add(nums[i] + "");
                }
                else
                {
                   ranges.add(nums[lower] + "->" + nums[i]);
                }
             }
        }
        return ranges;
    }
}