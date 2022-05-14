class Solution {
    public List<Integer> getRow(int rowIndex) {
        //For this approach we are going to save each row in the same list, we are just going to change the previous values
        //to do this we need to create a list of size rowIndex + 1, and we are going to add the first element of each row
        List<Integer> row = new ArrayList<>(rowIndex + 1)
        {
            {
                //this value is 1 for each row
                add(1);
            }    
        };
        //Now we have to loop through each row of the triangle
        for(int i = 0; i < rowIndex; i++)
        {
            //Now we need another loop to calculate the next row and save it in our list
            //we do it from right to left
            for(int j = i; j > 0; j--)
            {
                //Here we calculate each value of the next row, to do this we get the last value of the previous row
                //and we add it to the value on the left and we set it as the value in the i position (penultimate)
                row.set(j, row.get(j) + row.get(j - 1));
            }
            //until this point we have calculated the next row, but we are missing the final value, which is 1
            row.add(1);
        }
        //once we are finish we return our array with the current row
        return row;
    }
}