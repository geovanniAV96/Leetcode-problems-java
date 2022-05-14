class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;
        if(numRows >= 1)
        {
            List<Integer> firstElement = new ArrayList<>();
            firstElement.add(1);
            triangle.add(firstElement);
        }
        if(numRows >= 2)
        {
            List<Integer> secondElement = new ArrayList<>();
            secondElement.add(1);
            secondElement.add(1);
            triangle.add(secondElement);
        }
        
        int i = 1;
        //numRows = 4
        while(i < numRows - 1)
        {
            List<Integer> currentRow = new ArrayList<Integer>();
            //0 < 4
            for(int j = 0; j <= i + 1; j++)
            {
                if(j == 0 | j == i + 1)
                {
                    //add the 1's on the sides
                    currentRow.add(1);
                }
                else
                {
                    //System.out.println(triangle.get(1));
                    //add the middle values
                    currentRow.add(triangle.get(i).get(j - 1) + triangle.get(i).get(j));
                }
            }
            i++;
            triangle.add(currentRow);
        }
        return triangle;
    }
}