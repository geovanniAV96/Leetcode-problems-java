class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int currentSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < height.length; i++)
        {
            for(int j = i + 1; j < height.length; j++)
            {
                if(height[i] <= height[j])
                {
                    currentSum = height[i] * (j - i);
                }
                else
                {
                    currentSum = height[j] * (j - i);
                }
                if(currentSum > result) result = currentSum;
            }
        }
        return result;
    }
}

