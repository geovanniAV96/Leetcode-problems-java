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
        if(headA == null || headB == null) return null;
        
        Stack<ListNode> listA = new Stack<>();
        Stack<ListNode> listB = new Stack<>();
        
        ListNode intersection = null;
        
        while(headA != null)
        {
            listA.push(headA);
            headA = headA.next;
        }
        
        while(headB != null)
        {
            listB.push(headB);
            headB = headB.next;
        }
        
        while(!listA.isEmpty() && !listB.isEmpty())
        {
            if(listA.peek() == listB.peek())
            {
                intersection = listA.pop();
                listB.pop();
            }
            else
            {
                return intersection;
            }
        }
        return intersection;
    }
}