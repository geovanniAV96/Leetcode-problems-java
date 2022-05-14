class Solution {
    public String longestCommonPrefix(String[] strs) {
        //if we get an empty array we return an empty string ""
        if(strs.length == 0) return "";
        //we need to set the first string as a prefix, to compare with the rest of the strings
        String prefix = strs[0];
        //We loop through the array, starting from the second element
        for(int i = 1; i < strs.length; i++)
        {
            //while the prefix is not contain at the start of the 'i' string
            //exaple: flower is not contain at the start of flow so it returns -1
            //        flow or flo or fl is contain at the start of flow so it returns 0
            //the indexOf method searches for a particular string in another one
            //it returns the index of the first occurrence of the character in the string
            //and if you pass a string return the index of the first letter if it founds a match
            //that's why it returns 0 when the string is at the start a.k.a prefix
            //using an empty string with indexOf returns 0
            while(strs[i].indexOf(prefix) != 0)
            {
                //we need to eliminate the last letter so we can get out of the loop in case there is a match
                //using substring from the start of the string to the length - 1 we eliminate the last character
                //doing this we are going to get the common prefix between the two strings
                //example: "flower".subString(0, 5) returns "flowe"
                prefix=prefix.substring(0, prefix.length() - 1);
            }
        }
        //we return the common prefix or an empty string if there isn't one or the array is empty
        return prefix;
    }
}