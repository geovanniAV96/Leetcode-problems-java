
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //Firs we create a list pointing to our head, so we can return our head at the end
        ListNode current_node = head;
        //Then we need to loop through our list until we reach the end
        while(current_node != null && current_node.next != null)
        {
            //Now if we find a duplicate, i.e. when our current node and the next are equals
            if(current_node.val == current_node.next.val)
            {
                //we skip the duplicate
                current_node.next = current_node.next.next;
            }
            else
            {
                //if they aren't duplicates we just continue traversing our list
                current_node = current_node.next;
            }
        }
        //Because we didn't touch our head we can return it
        return head;
    }
}