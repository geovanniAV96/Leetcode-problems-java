class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", ""));
        int i = 0;
        int j = str.length() - 1;
        int middle = str.length() / 2;
        
        if(str.length() == 0) return true;
        
        while(i < middle || j >= middle )
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}