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
        //We creat a dummy head to start our new list and use it as reference
        //to return the final list
        ListNode dummy_head = new ListNode(0);
        //we create anothe node that points to the dummy head so we don't lose that reference
        ListNode l3 = dummy_head;
        //we need a variable to save the carry when we need it 
        int carry = 0;
        //we loop through both lists until we reach the end of both of them
        while(l1 != null || l2 != null)
        {
            //if the list have different length we will have null values so we take them
            //as 0's so they don't affect the sum
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            //we make the sum of the current values of both lists and add the carry
            //in case it is 1
            int current_sum = l1_val + l2_val + carry;
            //we can get the carry dividing by 10 because we are using an int and
            //if we have a 9 or less the carry is 0 and if we have more the carry is 1
            carry = current_sum / 10;
            //we can get the last digit of the current sum by using mod 10
            int last_digit = current_sum % 10;
            //now we store this digit in a new node
            ListNode new_node = new ListNode(last_digit);
            //and we add it to our list
            l3.next = new_node;
            //if we haven't reach the end of the list we move them forward
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            //finally we move our pointer forward
            l3 = l3.next;
        }
        //at the end we could have a carry that we need to take care of
        if(carry > 0)
        {
            //so if we do we create a new node with said carry
            ListNode new_node = new ListNode(carry);
            //and we add it to the list
            l3.next = new_node;
            //and we move our pointer forward
            l3 = l3.next;
        }
        //finally we return our dummy head that is pointing at the start of our list
        //we have to move it forward because the first node is a 0
        return dummy_head.next;
    }
}