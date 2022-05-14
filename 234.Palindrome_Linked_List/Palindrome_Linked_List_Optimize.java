/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //We create two pointers to find the middle of the list
        //one that is going to move quicker
        ListNode fastPointer = head;
        //and one that moves slower
        ListNode slowPointer = head;        
        //We loop through the list until the faster pointer is null, that means we reach the end
        //and the slower pointer should end up in the middle
        while(fastPointer != null && fastPointer.next != null)
        {
            //to be faster we need to move this pointer 2 positions
            fastPointer = fastPointer.next.next;
            //to be slower we move this pointer just one position
            slowPointer = slowPointer.next;
        }
        //we need to reverse the second half of the list
        slowPointer = reversed(slowPointer);
        //we also need to set the fastPointer to the head, to be able to compare both "sublists"
        fastPointer = head;
        //now we traverse both sublist to compare each value
        while(slowPointer != null)
        {
            if(slowPointer.val != fastPointer.val)
            {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
                
        }
        //If we reach the end, that means the elements of both sublists are equal, which means that
        //we have a palindrome, so we return true
        return true;
    }
    //We will used this method to reverse a linked list
    public ListNode reversed(ListNode head)
    {
        //we create a reference to the previous element of the head
        ListNode prev = null;
        //We loop through the list while the head is not null
        while(head != null)
        {
            //We create a reference for the node next to the current head
            ListNode next = head.next;
            //we set the next element as the previous one to start reversing the list
            head.next = prev;
            //finally we move our pointers forward
            prev = head;
            head = next;
        }
        //at the end we want the pointer of the reversed list, which is the prev node
        //so we return it
        return prev;
    }
}