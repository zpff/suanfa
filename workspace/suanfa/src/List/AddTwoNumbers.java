package List;

import java.nio.channels.Selector;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyNode;
        int carry = 0;
        while(p != null || q !=null){
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            carry = (x + y) / 10;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0){
            curr.next = new ListNode(1);
        }
        return dummyNode.next;
    }
}
