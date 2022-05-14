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
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        ListNode prev = null;
        ListNode current = null;
        
        
        while(fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            //System.out.println(slowPointer.val);
        }
        
        current = slowPointer;
        while(current != null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        fastPointer = head;
        
        while(prev != null && fastPointer != null)
        {
            if(prev.val != fastPointer.val)
            {
                return false;
            }
            else
            {
                prev = prev.next;
                fastPointer = fastPointer.next;
            }
                
        }
        return true;
    }
}