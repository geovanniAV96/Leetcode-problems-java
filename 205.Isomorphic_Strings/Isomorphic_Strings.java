import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        StringBuilder finalString = new StringBuilder();
        Hashtable<Character, Character> seen = new Hashtable<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(!seen.containsValue(t.charAt(i)))
            {
                seen.put(s.charAt(i), t.charAt(i));
            }
        }
        for(int i = 0; i < s.length(); i++)
        {
            finalString.append(seen.get(s.charAt(i)));
        }
        if(finalString.toString().equals(t))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
