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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //We need a reference to the head so we can return it at the end
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        //We also need two pointers one slow and one fast
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        //Now we are going to move the fast pointer until n + 1, this is going to help
        //us to get in a position where if we do another loop, the slow pointer is going
        //to end up one node before the one we want to delete which is exactly what we need
        for(int i = 1; i <= n + 1; i++)
        {
            fast = fast.next;
        }
        //now we make the second loop where slow is going to end up before the node we want to delete
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        //now we just delete the node
        slow.next = slow.next.next;
        //and finally we just return the dummy head
        return dummy_head.next;
    }
}


