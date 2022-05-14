class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        if(nums.length == 1) return nums[0];
        
        int size_group = 1;
        int sum = Integer.MIN_VALUE;
        int aux = 0;
        int arraySum = Arrays.stream(nums).sum();
        
        while(size_group <= nums.length - 1)
        {
            for(int i = 0; i <= nums.length - size_group; i++)
            {
                for(int j = i; j < i + size_group; j++)
                {
                    aux = aux + nums[j];
                }
                if(aux > sum)
                    sum = aux;
                aux = 0;
            }
            size_group++;
        }
        
        if(arraySum <= sum)
        {
            return sum;
        }
        else
        {
            return arraySum;
        }
            
    }
}