class Solution {
    public String addBinary(String a, String b) {
        //First we create a string builder to return out answer
        StringBuilder sb = new StringBuilder();
        //Then we create the pointer for the string a
        int i = a.length() - 1;
        //and the pointer for the string b
        int j = b.length() - 1;
        //we need a variable to store the carry value in case we need to
        int carry = 0;
        //Now we need to loop through each string from finish to start
        while(i >= 0 || j >= 0)
        {
            //we create a variable to store the current sum
            int sum = carry;
            //if we aren't at the start of a then we add the current value to our sum
            //to get the current value we get the character and we substract '0' to get the actual value
            //and not the ASCCI value and we use 0 to not affect the value
            if(i >= 0) sum += a.charAt(i) - '0';
            if(j >= 0) sum += b.charAt(j) - '0';
            //then we get the mod of the sum, this means that if we have 1 + 1 = 2 the result is 0, 
            //if we have 1 + 0 = 1 the result is 1 and if we have 0 + 0 = 0 the result is 0
            //for that particular position, an we append the result to the string builder
            sb.append(sum % 2);
            //if we have a carry we save it in our variable, for example if the sum is 2 from 1 + 1
            //we have carry of 1 therefore 2 / 2 = 1 or if we dont have a carry: 1 / 2 from 1 + 0 or 0 + 0
            // 0 / 2 = 0
            carry = sum / 2;
            //then we move our pointers
            i--;
            j--;         
        }
        //if we have a carry we have to appended to our string builder
        if(carry != 0) sb.append(carry);
        //finally we return our string, but since the method append adds things at the end of the string
        //we have to reverse our string builder and cast it to string to be able to return it
        return sb.reverse().toString();
         
    }
}