public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Boolean>  map=new HashMap<>();
        while(head!=null)
        {
            if(map.containsKey(head)){
                return head;
            }
            map.put(head,true);
            head=head.next;
        }
        return null;
    }
}