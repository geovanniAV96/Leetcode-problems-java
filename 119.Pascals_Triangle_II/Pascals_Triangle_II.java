class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<>();
        triangle.add(1);
        if(rowIndex == 0) 
        {
            return triangle;
        }
        
        int i = 1;
        while(i <= rowIndex)
        {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 1; j < i; j++)
            {
                currentRow.add(triangle.get(j - 1) + triangle.get(j));
            }
            currentRow.add(1);
            triangle = currentRow;
            i++;
        }
        return triangle;
    }
}