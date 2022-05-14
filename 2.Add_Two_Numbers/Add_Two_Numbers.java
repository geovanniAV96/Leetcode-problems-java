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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remain = 0;
        ListNode helper = new ListNode();
        ListNode result = helper;
        
        while(l1 != null || l2 != null)
        {
            ListNode temp = new ListNode();
            int l1val = 0;
            int l2val = 0;
            if(l1 == null)
            {
                l1val = 0;
            }
            else
            {
                l1val = l1.val;
            }
                
            if(l2 == null)
            {
                l2val = 0;
            }
            else
            {
                l2val = l2.val;
            }
            int currentSum = l1val + l2val + remain;
            if(currentSum >= 10)
            {
                remain = 1;
                currentSum = currentSum % 10;
            }
            else
            {
                remain = 0;
            }
            temp.val = currentSum;
            helper.next = temp;
            helper = helper.next;
            if(l2 != null)
                l2 = l2.next;
            if(l1 != null)
            l1 = l1.next;
            currentSum = 0;
        }
        if(remain > 0)
        {
            helper.next = new ListNode(remain);
        }
        
        return result.next;
    }
}