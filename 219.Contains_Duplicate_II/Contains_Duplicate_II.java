class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return false;
        HashMap<Integer, Integer> seen = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!seen.containsKey(nums[i]))
            {
                seen.put(nums[i], i);
            }
            else
            {
                if(Math.abs(seen.get(nums[i]) - i) <= k)
                {
                    return true;
                }
                else
                {
                    seen.replace(nums[i], i);
                }
            }
        }
        
        return false;
        
    }
}