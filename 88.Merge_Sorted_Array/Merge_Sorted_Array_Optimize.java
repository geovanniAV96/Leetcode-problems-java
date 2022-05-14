class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //First we need 3 pointers, one for nums1, another for nums2 and an aditional one for the final array
        //for this we need to use our variables m and n to get the actual length of the three arrays
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        //We need to loop through both arrays from the end to the start
        while(p2 >=0)
        {
            //Now we are not out of bounds in our nums1 array and if the value in nums1 is greater than
            //the value in nums2
            if(p1 >= 0 && nums1[p1] > nums2[p2])
            {
                //we set the value at the end or where our i pointer is because is the greater value
                //after we assign the value we move both pointers backwards, thats what it means using
                //[i--] you use the value in [i] and after you decrement by 1 a.k.a. i--
                nums1[i--] = nums1[p1--];
            }
            else
            {
                //if nums2 value is equals or greater we set that value at the en or where our i pointer is
                //after we assign the value we move both pointers backwards, thats what it means using
                nums1[i--] = nums2[p2--];
            }
        }
        
    }
}

