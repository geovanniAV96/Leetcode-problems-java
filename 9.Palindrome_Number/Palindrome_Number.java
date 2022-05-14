class Solution {
    public boolean isPalindrome(int x) {
        String integr = String.valueOf(x);
        
        String reverse;
        String normal;
        
        StringBuilder stringBuilderR = new StringBuilder();
        
        for(int i = integr.length() - 1; i >= 0 ; i--)
        {
            stringBuilderR.append(integr.charAt(i));
        }
        
        reverse = stringBuilderR.toString();
        System.out.println(reverse);
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < integr.length() ; i++)
        {
            stringBuilder.append(integr.charAt(i));
        }
        
        normal = stringBuilder.toString();
        System.out.println(normal);
        
        if(normal.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}