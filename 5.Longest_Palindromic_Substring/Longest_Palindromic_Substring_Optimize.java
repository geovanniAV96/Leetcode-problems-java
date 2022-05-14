class Solution {
    public String longestPalindrome(String s) {
        //First we need to check that our input is valid
        if(s == null || s.length() < 1) return "";
        //we also need variables to store the start and the end of the longest palindrom
        int start = 0;
        int end = 0;
        //we need to loop through our string to expand our search from each character
        for(int i = 0; i < s.length(); i++)
        {
            //We have two cases for a palindrom, when the middle is unique
            int len1 = expandFromMiddle(s, i, i);
            //or when the middle has a pair
            int len2 = expandFromMiddle(s, i, i+1);
            //Now we have to check wich is the longest between both of them
            int len = Math.max(len1, len2);
            //if we have a new longest palindrom or the first one for that matter
            if(len > end - start)
            //we have to get the position of the current largest palindrom
            {
                //here we are at the center and we want the start of the substring
                //which is at the left of the center, and we have to take into account 
                //that we are working with indexes
                start = i - ((len - 1) / 2);
                //here we just get the half and add it to the center to get the end
                //of the substring
                end = i + (len / 2);
            }
        }
        //At the end we are going to have the starting position and ending position of
        //the substring with the longest palindrom, so we can return that
        return s.substring(start, end + 1);
    }
    //we are going to use this method to check the length of the longest palindrom 
    //using the current position and expanding to each side to return the length
    public int expandFromMiddle(String s, int left, int right)
    {
        //if we get an invalid string or positions we return 0
        if(s == null || left > right) return 0;
        //now we loop while we haven't reach the end of the string on either side and
        //the character in either side are equals
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            //we move our left index to the left
            left--;
            //and the right index to the right
            right++;
        }
        //finally we return the length of the longest palindrom in this position
        return right - left - 1;
    }
}