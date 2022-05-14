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
        if(head == null) return false;
        
        Hashtable<Integer, ListNode> appeared = new Hashtable<>();
        appeared.put(head.hashCode(), head);
        while(head.next != null)
        {
            head = head.next;
            
            if(appeared.containsKey(head.hashCode()))
            {
                return true;
            }
            else
            {
                appeared.put(head.hashCode(), head);
            }
        }
        return false;
    }
}