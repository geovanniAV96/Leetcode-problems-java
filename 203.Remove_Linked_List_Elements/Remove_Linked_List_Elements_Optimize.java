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
    public ListNode removeElements(ListNode head, int val) {
        //if we have to delete the first element we can just move the head to the next node
        //so we can do this until we find a "valid" head
        while(head != null && head.val == val)
        {
            head = head.next;
        }
        //Then we need a pointer to keep the head as is so we can return it
        ListNode current_node = head;
        //Now we loop through the list while we don't reach the end
        while(current_node != null && current_node.next != null)
        {
            //we have to check if the next node is one that we want to remove
            if(current_node.next.val == val)
            {
                //if we have to remove a node we just remove that reference so we skip the next node
                current_node.next = current_node.next.next;
            }
            else
            {
                //if we don't want to remove this element we just keep moving forward
                current_node = current_node.next;
            }
        }
        return head;
    }
}