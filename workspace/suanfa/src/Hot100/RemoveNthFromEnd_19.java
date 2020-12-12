package Hot100;

import List.ListNode;
import com.sun.org.apache.bcel.internal.generic.RET;


public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode count = head;
        int num = 1;
        while(count.next != null){
            count = count.next;
            num++;
        }
        if(n == num) return head.next;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
