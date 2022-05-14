class Solution {
    public List<List<Integer>> generate(int numRows) {
        //First we need to create a list of lists of integers, this list is going to represente our triangle
        List<List<Integer>> triangle = new ArrayList<>();
        //Now we need to check if we receive an empty input, if we do we return our empty triangle
        if(numRows == 0) return triangle;
        //We also need a base case, in this case is the first row, so we need a list of integers for it
        List<Integer> first_row = new ArrayList<>();
        //and because the firs row only have 1 element and is a 1 we added here
        first_row.add(1);
        //now we added to the triangle as our first element
        triangle.add(first_row);
        //Then we have to loop through the triangle while we build it
        for(int i = 1; i < numRows; i++)
        {
            //we are going to save the previous row in a list
            List<Integer> prev_row = triangle.get(i - 1);
            //and the current row in another one
            List<Integer> row = new ArrayList<>();
            //We now that each row of the triangle start with a 1, so we can add it before hand
            row.add(1);
            //and now we can loop through the row to construct it, we now that we have to start
            //with the second element and loop through before we reach the end, and that would be i
            for(int j = 1; j < i; j++)
            {
                //while we loop we have to add j - 1 and j from the previous row
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            //now we can add the 1 at the end of each row
            row.add(1);
            //now we add the current row to our triangle
            triangle.add(row);
        }
        //Finally we return our finished triangle
        return triangle;
    }
}