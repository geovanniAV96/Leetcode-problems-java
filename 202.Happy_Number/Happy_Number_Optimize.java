class Solution {
    public boolean isHappy(int n) {
        //We will use a hash set to keep track of the numbers that we already have seen
        HashSet<Integer> seen = new HashSet<>();
        //Then we will loop until we reach the expected result for a happy number which is 1
        while(n != 1)
        {
            //We also need a variable to keep track of the current number we are processing
            int current = n;
            //And another one for the sum of each digit of the current number
            int sum = 0;
            //Now we have to loop through each digit of the current number
            while(current != 0)
            {
                //Here we get the square value of the current digit and added to the sum
                sum += (current % 10) * (current % 10);
                //we move to the next digit of the current number
                current /= 10;
            }
            //We check if we have seen the current number, if we have then we are in a loop so we return false
            if(seen.contains(sum))
            {
                return false;
            }
            //if we haven't seen the current number we added to the hashset
            seen.add(sum);
            //and we move to the next number
            n = sum;
        }
        //Finally we return true because it means we get a 1 so we have a happy number
        return true;
    }
}
    