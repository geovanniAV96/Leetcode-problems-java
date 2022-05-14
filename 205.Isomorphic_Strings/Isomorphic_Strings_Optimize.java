class Solution {
    public boolean isIsomorphic(String s, String t) {
        //If we receive two strings with different length we can return false because there is no way
        //for it to be isomorphic
        if(s.length() != t.length()) return false;
        //we create 2 arrays of the size of all ascii values (128)
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        //now we loop through both string, since they are the same size we can use either one
        for(int i = 0; i < s.length(); i++)
        {
            //we check if the value at the same position in each array is different, if is empty
            //means that we haven't see that character, so we continue, but if it is different that means 
            //we don't have an equivalent value to make the conversion from s to t, so we return false
            //because there is no way for them to be isomorphic
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;
            //now we put in the current character value position the iteration + 1, this means we visit
            //this character at this iteration and we keep it in sync with the current character in 
            //string t, so we can check if we see again this character if is the same value still
            arr1[s.charAt(i)] = i + 1;
            //and we keep in sync with string t
            arr2[t.charAt(i)] = i + 1;
        }
        //If we get to here that means we have isomorphic strings so we return true
        return true;
    }
}