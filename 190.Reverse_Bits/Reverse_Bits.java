public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String base = "00000000000000000000000000000000";
        String stringNumber = Integer.toBinaryString(n);
        
        StringBuilder reverse = new StringBuilder();
        while (stringNumber.length() < 32) stringNumber = "0" + stringNumber;
        
        for(int i = stringNumber.length() - 1; i >= 0; i--)
        {
            reverse.append(stringNumber.charAt(i));
            
        }
        
        n = Integer.parseInt(reverse.toString(), 2);
        return n;
    }
}