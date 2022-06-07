class Solution {
    public List<String> generateParenthesis(int n) {
        //For this solution we are going to use backtracking
        //to do this we need the variable that we need to return, in this case a list
        List<String> output_arr = new ArrayList();
        //then we need a recursive call to a helper method with basically placeholder data that doesn't affect the algorithm
        backtrack(output_arr, "", 0, 0, n);
        //and finally we return our variable
        return output_arr;
    }
    //here we need to use our recursive method to make the diferent decision needed and construct our final answer
    public void backtrack(List<String> output_arr, String current_string, int open, int close, int max)
    {
        //First we need to check our base case, in this problem is that the length of our final string,
        //shouldn't be larger than n*2 since we are looking for pairs
        if(current_string.length() == max * 2)
        {
            //if we get to here we found a suitable combination so we add it to the list that we are going to return
            output_arr.add(current_string);
            return;
        }
        //After the base case we need to put our decision to form the final answer
        //for this problem we have two, we can't have more open parentheses than n, since we need a pair 
        //if that's the case we need to make a recursive call to add an open parentheses and
        //since we are keeping track of the number of open parentheses we add to that as well
        if(open < max) backtrack(output_arr, current_string + "(", open + 1, close, max);
        //we also can't have a closing parentheses before than its corresponding open one
        //if that's not the case we add a closing parentheses and we also add to the close variable
        //to keep track of the current number of closing parentheses
        if(close < open) backtrack(output_arr, current_string + ")", open, close + 1, max);
    }
}