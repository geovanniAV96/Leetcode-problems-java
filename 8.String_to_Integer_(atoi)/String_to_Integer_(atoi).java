class Solution {
    public int myAtoi(String s) {
        boolean positive = true;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        double result = 0;
        StringBuilder helper = new StringBuilder();
        int numberSigns = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(!Character.isDigit(s.charAt(i)) && (helper.length() > 0 || numberSigns > 0)) break;   
            if(s.charAt(i) == ' ') continue;
            if(s.charAt(i) == '+' && helper.length() == 0) 
            {
                positive = true;
                numberSigns++;
                continue;
            }
            if(s.charAt(i) == '-' && helper.length() == 0) 
            {
                positive = false;
                numberSigns++;
                continue;
            }
            if(!Character.isDigit(s.charAt(i))) break;
            helper.append(s.charAt(i));
        }
        if(helper.length() == 0 || numberSigns > 1) return 0;
        result = Double.parseDouble(helper.toString());
        if(positive == false)
        {
            result *= -1;
        }
        if(result > max) result = max;
        if(result < min) result = min;
        return (int)result;
    }
}