class Solution {
    public int maxArea(int[] height) {
        //Firt we set the max variable to store our maximum area and value that we are going to return
        int max = Integer.MIN_VALUE;
        //then we set a pointer at the start of the array
        int i = 0;
        //and we also need a pointer that starts at the end of the array
        int j = height.length - 1;
        //then we loop until our pointer cross each other
        while(i < j)
        {
            //since our limiting factor is the minor of the two heights we need to know which one is shorter
            int min = Math.min(height[i], height[j]);
            //and then we get the current area and compare it to the current max to get our new max value
            max = Math.max(max, min * (j - i));
            //now we have to check which pointer we have to move, we need to move the shortest one
            if(height[i] < height[j])
            {
                //so if the height in i is lower we move the i pointer
                i++;
            }
            else
            {
                //otherwise we move the j pointer
                j--;
            }
        }
        //once we are done with the loop we can return our max value which is the largest area we found
        return max;
    }
}

