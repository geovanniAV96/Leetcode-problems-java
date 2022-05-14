class Solution {
    public int romanToInt(String s) {
        int number = 0;
        int next = 0;
        int total = 0;
        HashMap<Character, Integer> romanNums = new HashMap<Character, Integer>();
        
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.length() == 0)
                return 0;
                
            number = romanNums.get(s.charAt(i));
            if(s.length() > 1 && (i + 1) < s.length())
            {
                next = romanNums.get(s.charAt(i + 1));
                
                if(number >= next)
                {
                    total += number;
                }
                if(number < next)
                {
                    total = total + (next - number);
                    i++;
                }
            }
            else
            {
                total += number;
            }
        }
        return total;
    }
}