class Solution {
    public int romanToInt(String s) {
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
            //We can use the principles given in the problem
            //If we have a 'V' or an 'X' after an 'I'            
            if(s.charAt(i) == 'V' || s.charAt(i) == 'X')
            {
                //Then we substract 2, to account for the 'I' that we add before and 'I' that we have to substract
                //example: IV = 1 + 5 - 2 = 4 or IX = 1 + 10 - 2 = 9
                if(i > 0 && s.charAt(i-1) == 'I')
                    total -=2;
            }
            //If we have an 'L' or an 'C' after an 'X'
            if(s.charAt(i) == 'L' || s.charAt(i) == 'C')
            {
                //Then we substract 20, to account for the 'X' that we add before and 'X' that we have to substract
                //example: XL = 10 + 50 - 20 = 40 or XC = 10 + 100 - 20 = 90
                if(i > 0 && s.charAt(i-1) == 'X')
                    total -=20;
            }
            //If we have an 'D' or an 'C' after an 'M'
            if(s.charAt(i) == 'D' || s.charAt(i) == 'M')
            {
                //Then we substract 200, to account for the 'C' that we add before and 'C' that we have to substract
                //example: CD = 100 + 500 - 200 = 400 or CM = 100 + 1000 - 200 = 900
                if(i > 0 && s.charAt(i-1) == 'C')
                    total -=200;
            }
            //If we dont enter any ifs we just add the number to the total
            total += romanNums.get(s.charAt(i));
        }
        return total;
    }
}