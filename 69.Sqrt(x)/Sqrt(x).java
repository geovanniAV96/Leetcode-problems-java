class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long middle = x / 2;
        System.out.println(middle * middle);
        long start = 0;
        long finish = x;
        while(true)
        {
            if(middle * middle == x)
                return (int)middle;
            if(middle * middle > x)
            {
                finish = middle;
                middle = (middle - start) / 2;
                if(middle == 0) return (int)start;
            }
            if(middle * middle < x)
            {
                if(middle == start) return (int)start;
                start = middle;
                middle = middle + (finish - middle) / 2;
            }
        }
    }
}