package List;

import java.util.HashSet;

public class _142_detectCycle {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        while(head!=null){
            if(!nodes.contains(head)){
                nodes.add(head);
            }else {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
