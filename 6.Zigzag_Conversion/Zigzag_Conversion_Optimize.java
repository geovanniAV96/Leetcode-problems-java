class Solution {
    public String convert(String s, int numRows) {
        //We need a stringbuilder array to store each row of the string
        StringBuilder[] sbs = new StringBuilder[numRows];
        //and we need to fill each position with a new StringBuilder
        for(int i = 0; i < numRows; i++)
        {
            sbs[i] = new StringBuilder();
        }
        //We can use a char array to store our input string
        char[] arr = s.toCharArray();
        //and we can do the same for the length of the string
        int n = arr.length;
        //we also need an index
        int index = 0;
        //to traverse in zig zag the string we can loop through it
        while(index < n)
        {
            //to go down we check that we haven't reach the bottom and we also need to 
            //check that we haven't reach the end of the string
            for(int j = 0; j < numRows && index < n; j++)
            {
                sbs[j].append(arr[index++]);
            }
            //once we reach the end we have to go up for this we check we haven't reach 
            //the top and that we haven't reach the end of the string
            for(int j = numRows - 2; j > 0 && index < n; j--)
            {
                sbs[j].append(arr[index++]);
            }
        }
        //after we go through each character we will have them separated their 
        //corresponding level, so we have to combine them
        //to do that we need a new stringbuilder
        StringBuilder res = sbs[0];
        for(int i = 1; i < numRows; i++)
        {
            res.append(sbs[i].toString());
        }
        return res.toString();
    }
}
