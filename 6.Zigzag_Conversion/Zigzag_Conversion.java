class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        int currentRow = 0;
        int currentChar = 0;
        boolean reverse = false;
        
        if(numRows <= 1) return s;
        
        for(int i = 0; i < numRows; i++)
        {
            rows[i] = new StringBuilder();
        }
        
        while(currentChar < s.length())
        {
            rows[currentRow].append(s.charAt(currentChar));
            
            if(currentRow == numRows - 1)
            {
                reverse = true;
            }
            if(currentRow == 0)
            {
                reverse = false;
            }
            
            if(reverse)
            {
                currentRow--;
            }
            else
            {
                currentRow++;
            }
            currentChar++;
        }
        
        StringBuilder answer = new StringBuilder(rows[0]);
        for(int i = 1; i < numRows; i++)
        {
            answer.append(rows[i]);
        }
        
        return answer.toString();
    }
}
