import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //First we check if we have a valid head, if not we return false
        if(head == null) return false;
        //We need two pointers, one slow and one fast
        //we set the slow pointer in the first position (head)
        ListNode slowPointer = head;
        //and the fast pointer in the second position
        ListNode fastPointer = head.next;
        //Now we go through the list while both pointers are different
        while(slowPointer != fastPointer)
        {
            //if we reach the end of the list with our fast pointer that means we don't have a loop 
            //so we return false
            if(fastPointer == null || fastPointer.next == null) return false;
            //Now we have to move our pointers
            //the slow pointer one at a time
            slowPointer = slowPointer.next;
            //the fast pointer two at a time
            fastPointer = fastPointer.next.next;
        }
        //if we get to here that means both pointers are equals which means that we have a loop so we return true
        return true;
    }
}