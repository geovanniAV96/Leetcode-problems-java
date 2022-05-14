import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> appeared = new Hashtable<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(appeared.containsKey(nums[i]))
            {
                appeared.remove(nums[i]);
            }
            else
            {
                appeared.put(nums[i], nums[i]);
            }
        }
          
        int answer = 0;
        for (int i : appeared.values()) 
        {
          answer = i;
        }

        return answer;
    }
}