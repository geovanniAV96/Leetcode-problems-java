/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //First we check if our input is valid, if not we return null
        if(headA == null || headB == null) return null;
        //Then we create to pointer, with the objective of not modify the original input
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;
        //Now we loop through both lists until we find the point of intersection
        while(a_pointer != b_pointer)
        {
            //if we get to the end of list A, we want to set it to the start of list B
            //The objective of this is to have both list with the same length
            if(a_pointer == null)
            {
                //we start at the head of list B
                a_pointer = headB;
            }
            else
            {
                //We just move through list A and B
                a_pointer = a_pointer.next;
            }
            //We have to do the same for list B, to have the same length in both list
            //once we reach the end we go to the begining of list A
            if(b_pointer == null)
            {
                //we start at the head of list A
                b_pointer = headA;
            }
            else
            {
                //We just move through list B and A
                b_pointer = b_pointer.next;
            }
        }
        //Once we finish we return the current node, if there is no intersection 
        //then the pointer is going to be null (end of the list)
        return a_pointer;
    }
}