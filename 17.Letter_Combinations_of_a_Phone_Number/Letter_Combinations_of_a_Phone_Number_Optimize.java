class Solution {
    public List<String> letterCombinations(String digits) {
        //First we create a linked list that is going to act like a queue
        LinkedList<String> ans = new LinkedList<String>();
        //If we have an invalid input we just return the empty list
        if(digits.isEmpty()) return ans;
        //Now we have to map every key into an array
        String[] mapping = new String[] {"0", "1", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //and we add an empty string to the list so we can remove values from the start
        ans.add("");
        //we need to loop through each input value
        for(int i = 0; i < digits.length(); i++)
        {
            //and we save the current digit
            int x = Character.getNumericValue(digits.charAt(i));
            //we are going to loop to make sure that we are saving only the values that correspond to the length of the input
            //for example using 23 as input
            // first loop: i = 0
            // [a,b,c]
            // second loop: i = 1
            // [b,c,ad,ae,af]
            // third loop: i = 1
            // [c,ad,ae,af,bd,be,bf]
            while(ans.peek().length() == i)
            {
                //here we get the last digit we visit, first is going to be an empty string
                String t = ans.remove();
                //then we get each value for the current key number
                for(char s : mapping[x].toCharArray())
                {
                    //and we use the last on to add them together in order to get each permutation
                    ans.add(t+s);
                }
            }
        }
        //Finally we just return ans, where we store each permutation
        return ans;
    }
}