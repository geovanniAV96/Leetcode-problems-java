class Solution {
    public boolean isPalindrome(String s) {
        //We need two indixes to go through the string
        //on starting from 0
        int i = 0;
        //and on starting from the end
        int j = s.length() - 1;
        //we also need to store the middle of the string to know when we are finished
        int middle = s.length() / 2;
        //now we go through the string until both indexes crosses each other
        while(i < j)
        {
            //now we move our indexes
            //while they don't cross and we don't have a letter 
            while(i < j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                //we move forward our i index
                i++;
            }
            //and while they don't cross and we don't have a letter 
            while(i < j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                //we move backwards our j index
                j--;
            }
            //now we check if the letter on the left index (i) is different than the one on the right (j) we return false
            //after checking that we move our indexes to the right for i and to the left j
            if(i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--)))
            {
                return false;
            }
        }
        //if we get to here that means we hava a palinfrome so we return true
        return true;
    }
}