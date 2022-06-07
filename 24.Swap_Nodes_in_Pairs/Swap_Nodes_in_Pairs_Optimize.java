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
    public ListNode swapPairs(ListNode head) {
        //We need a temp node as a prev node to use it to return at the end
        ListNode temp = new ListNode(0);
        //so we make it the previous element just before the head
        temp.next = head;
        //we also need a current node that we are going to set as the firs element
        //so is going to point towards temp and we are going to use it to not make any change to temp
        ListNode current = temp;
        //Now we have to loop through the list, just checking that the next node and the next of that one
        //are different to null so we can process every element
        while(current.next != null && current.next.next != null)
        {
            //since the first element of the list right now is current.next we set a reference to that node
            ListNode first_node = current.next;
            //we also need a reference to the second element
            ListNode second_node = current.next.next;
            //now we set the third element as the next one to the first element, to swap the first_node to the right
            first_node.next = second_node.next;
            //then we set the sencond node before the first one, to swap it to the left
            current.next = second_node;
            //and we keep the list connected making the first_node the next to the second_node
            current.next.next = first_node;
            //we need to move our current reference two elements
            current = current.next.next;
        }
        //finally we just return the reference that we save at the start, since we have a 0 at the start
        //we need to return from the next element
        return temp.next;
    }
}
