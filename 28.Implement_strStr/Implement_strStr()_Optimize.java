class Solution {
    public int strStr(String haystack, String needle) 
    {
        //If we received an invalid input or if the needle is longer than the haystack 
        //We cannot have a match so we return -1
        if(haystack == null || needle == null || needle.length() > haystack.length())
            return -1;
        //if the needle is an empty string we must return 0
        if(needle.length() == 0)
            return 0;
        //we need to iterate through the haystack, but only until it doesn't matter
        //this means that if we reach a point were is impossible to have the needle we stop
        //for example if we have a stack of 5 in length an a needle of 2 
        //and we reach a point where is impossible to have the needle like position 3 in the haystack
        //H-E-L-P at this point is impossible to have the needle 'LL' because we are only missing one character
        //from the haystack (HELPS)
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++)
        {
            //If we have a match between the current character in the stack and the first character of the needle
            if(haystack.charAt(i) == needle.charAt(0))
            {
                //then we check if the substring between the current character in the haystack 
                //and the length of the needle (plus the current character to account for that difference)
                //is equals to the actual needle
                if(haystack.substring(i, needle.length() + i).equals(needle))
                    //if we have a match, we return the index of the current character in the haystack
                    return i;
            }
               
        }
        //if can't find a match we return -1
        return -1;
            
    }
}
