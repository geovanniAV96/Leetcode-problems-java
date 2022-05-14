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
    public ListNode reverseList(ListNode head) {
        //We need a reference to the previous node
        ListNode prev = null;
        //we are going to loop through the list from start to finish so while the head is not null
        while(head != null)
        {
            //We also need a reference to the next node
            ListNode next_node = head.next;
            //now we need to reverse the connections in the linked list
            //so we have to point the current node to the previous one
            head.next = prev;
            //now we need to move forward our pointers
            prev = head;
            //and the head
            head = next_node;
        }
        //finally we need to return the prev node since that should be the first element of the new list
        return prev;
    }
}