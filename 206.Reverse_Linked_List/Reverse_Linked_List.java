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
        if(head == null) return head;
        
        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        
        while(currentNode != null)
        {
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            if(currentNode != null)
                nextNode = currentNode.next;
        }
        return prevNode;
    }
}