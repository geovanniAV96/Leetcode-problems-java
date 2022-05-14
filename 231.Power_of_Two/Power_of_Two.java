class Solution {
    public boolean isPowerOfTwo(int n) {
        int timesOne = 0;
        if(n <= 0) return false;
        for(int i = 0; i < 32; i++)
        {
            if((n & 1) > 0) timesOne++;
            n >>=1;
        }
        if(timesOne > 1)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}