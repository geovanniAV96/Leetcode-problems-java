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
        if(head == null || head.next == null) return null;
        
        ListNode aux = head;
        ListNode sizeHelper = head;
        ListNode prev = null;
        int size = 0;
        
        while(sizeHelper != null)
        {
            sizeHelper = sizeHelper.next;
            size++;
        }
        for(int i = 0; i < size - n; i++)
        {
            prev = aux;
            aux = aux.next;
        }
        if(aux.next == null) // last node
        {
            prev.next = null;
        }
        else if(prev == null) // first node
        {
            return aux.next;
        }
        else // any node
        {
            prev.next = aux.next;
            aux.next = null;
        }
        
        return head;
    }
}