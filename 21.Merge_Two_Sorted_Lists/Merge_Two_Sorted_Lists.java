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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //We need to create a temp node to save the reference to the head of the new sorted list
        ListNode temp_node = new ListNode(0);
        //We create the list that is going to save every node of both lists and starts
        //equals to temp node
        ListNode current_node = temp_node;
        //We loop through both list until we reach the last node of either 
        while(list1 != null && list2 != null)
        {
            //we check if list1 is less than list2
            if(list1.val < list2.val)
            {
                //if list1 is less then we set list1 as the smallest in our current node list
                current_node.next = list1;
                //we move forward our pointer in the list1 list
                list1 = list1.next;
            }
            else
            {
                //if list1 is greater or equals then we set list2 as the smallest in our current node list
                current_node.next = list2;
                //we move forward our pointer in the list2 list
                list2 = list2.next;
            }
            //then we need to move forward our current node list
            current_node = current_node.next;
        }
        //we get out of the loop when we reach the last node in one of the list
        //so we have to account for the nodes that we dont visit in the other list
        
        //if we dont reach the end of list1
        if(list1 != null)
        {
            //we set in our current node list1
            current_node.next = list1;
        }
        
        //if we dont reach the end of list2
        if(list2 != null)
        {
            //we set in our current node list2
            current_node.next = list2;
        }
        
        //we have to return the head of current_node, and we save that reference in temp_node
        //so we have to return that node
        return temp_node.next;
    }
}