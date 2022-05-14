class Solution {
    public int lengthOfLastWord(String s) {
        // We need to eliminate all the extra spaces after the last string, for that we can use
        // the build in function trim()
        s = s.trim();
        // Then we need to calculate the index of out last word, for this we can use the build in
        // function lastIndexOf(), this will return the index of the last ocurrence of a character
        // in a string, we need to add +1 to account for the space that we are getting
        int lastIndex = s.lastIndexOf(' ') + 1;
        // Finally we return the length of the last word, for this we substract the position of
        // the final word to the string trimed
        return s.length() - lastIndex;
    }
}