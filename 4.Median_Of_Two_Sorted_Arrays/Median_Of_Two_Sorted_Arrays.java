class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int position1 = 0;
        int position2 = 0;
        int num1 = 0;
        int num2 = 0;
        
        if(nums1.length > 0)
            num1 = nums1[position1];
        if(nums2.length > 0)
            num2 = nums2[position2];
        int[] answer = new int[nums1.length + nums2.length];
        
        if(nums1.length >= nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                
                if(num1 < num2)
                {
                    if(nums1.length > 0)
                    {
                        answer[i] = num1;
                    }
                    
                    if((position1 + 1) <= (nums1.length-1))
                    {
                        position1++;
                        num1 = nums1[position1];
                    }
                    else
                    {
                        for(int j = i + 1; nums2.length > position2; j++)
                        {
                            
                            if((position2 + 1) < (nums2.length-1))
                            {
                                answer[j] = nums2[position2++];
                                
                            }
                            else
                            {
                                if(nums1.length == 0)
                                {
                                    answer[j-1] = nums2[position2];
                                }
                                else
                                {
                                    answer[j] = nums2[position2];
                                }
                                position2++;
                            }
                        }
                    }
                    
                }
                else
                {
                    if(nums2.length > 0)
                    {
                        answer[i] = num2;
                    }
                    if((position1 + 1) <= (nums1.length-1))
                    {
                        num2 = nums2[position2++];
                    }
                    else
                    {
                        for(int j = i + 1; nums1.length > position1; j++)
                        {
                            if((position1 + 1) < (nums1.length-1))
                            {
                                answer[j] = nums1[position1++];
                            }
                            else
                            {
                                if(nums2.length == 0)
                                {
                                    answer[j-1] = nums1[position2];
                                }
                                else
                                {
                                    answer[j] = nums1[position2];
                                }
                                position1++;
                            }
                            
                        }
                    }
                }
                
            }
        }
        else
        {
            for(int i = 0; i < nums2.length; i++)
            {
                if(num1 < num2)
                {
                    if(nums1.length > 0)
                    {
                        answer[i] = num1;
                    }
                    if((position1 + 1) <= (nums1.length-1))
                    {
                        position1++;
                        num1 = nums1[position1];
                    }
                    else
                    {
                        for(int j = i + 1; nums2.length > position2; j++)
                        {
                            
                            if((position2 + 1) < (nums2.length-1))
                            {
                                answer[j] = nums2[position2++];
                                
                            }
                            else
                            {
                                if(nums1.length == 0)
                                {
                                    answer[j-1] = nums2[position2];
                                }
                                else
                                {
                                    answer[j] = nums2[position2];
                                }
                                position2++;
                            }
                        }
                    }
                    
                }
                else
                {
                    if(nums2.length > 0)
                    {
                        answer[i] = num2;
                    }
                    if((position1 + 1) <= (nums1.length-1))
                    {
                        num2 = nums2[position2++];
                    }
                    else
                    {
                        for(int j = i + 1; nums1.length > position1; j++)
                        {
                            if((position1 + 1) < (nums1.length-1))
                            {
                                answer[j] = nums1[position1++];
                            }
                            else
                            {
                                if(nums2.length == 0)
                                {
                                    answer[j-1] = nums1[position2];
                                }
                                else
                                {
                                    answer[j] = nums1[position2];
                                }
                                position1++;
                            }
                            
                        }
                    }
                }
                
            }
        }
        
        if((answer.length % 2) == 0)
        {
            
            int media1 = (int)Math.floor((double)(answer.length / 2.0)) - 1;
            int media2 = (int)Math.ceil((double)(answer.length / 2.0));
            //System.out.println(Arrays.toString(answer));
            return (answer[media1] + answer[media2]) / 2.0; 
            
        }
        else
        {
            
            int media = (int)Math.floor((double)(answer.length / 2.0));
            //System.out.println(Arrays.toString(answer));
            return answer[media];
        }
        
    }
}