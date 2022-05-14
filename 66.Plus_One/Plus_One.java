class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] + 1 < 10)
            {
                digits[i] = digits[i] + 1;
                return digits;
            }
                
            if(digits[i] + 1 == 10 && i > 0)
            {
                digits[i] = 0;
                if(digits[i - 1] < 9)
                {
                    digits[i - 1] = digits[i - 1] + 1;
                    return digits;
                }
                    
            }
        }
        int[] new_number = new int[digits.length + 1];
        new_number[0] = 1;
        new_number[1] = 0;
        return new_number;
    }
}
