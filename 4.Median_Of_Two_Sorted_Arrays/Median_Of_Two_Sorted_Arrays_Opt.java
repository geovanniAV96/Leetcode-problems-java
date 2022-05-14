int total = nums1.length + nums2.length;
        int half = total / 2;
        
        int left1 = 0;
        int right1 = 0;
        int left2 = 0;
        int right2 = 0;
        
        double mid = 0.0;
        
        if(nums2.length < nums1.length)
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int left = 0;
        int right = nums1.length - 1;
        
        while(true)
        {
            int i = Math.floorDiv(left + right, 2);
            int j = half - i - 2;
            
            
            
            if(i >= 0)
            {
                left1 = nums1[i];
            }
            else
            {
                left1 = Integer.MIN_VALUE;
            }
            if((i + 1) < nums1.length)
            {
                right1 = nums1[i + 1];
            }
            else
            {
                right1 = Integer.MAX_VALUE;
            }
            if(j >= 0)
            {
                left2 = nums2[j];
            }
            else
            {
                left2 = Integer.MIN_VALUE;
            }
            if((j + 1) < nums2.length)
            {
                right2 = nums2[j+1];
            }
            else
            {
                right2 = Integer.MAX_VALUE;
            }
            if(left1 <= right2 && left2 <= right1)
            {
                if(total % 2 != 0)
                {
                    mid = Math.min(right1, right2);
                }
                else if(total % 2 != 0)
                {
                    mid = (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
                return mid;
            }
            else if(left1 > right2)
            {
                right = i - 1;
            }
            else
            {
                left = i + 1;
            }
        }