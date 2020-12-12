package List;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _445_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*l1 = reverse(l1);
        l2 = reverse(l2);
        int addOne = 0;
        ListNode dummy = new ListNode(-1);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = dummy;
        while(p!=null||q!=null){
            int x = p ==null ? 0:p.val;
            int y = q ==null ? 0:q.val;
            int sum = addOne + x + y;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            addOne = addOne /10;
            if(p!=null){
                p = p.next;
            }
            if(q!= null){
                q = q.next;
            }

        }
        if(addOne > 0){
            cur.next = new ListNode(1);
        }

        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode third = null;
        while(cur !=null){
            third = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur.next;
        }
        return pre;*/
        Deque<ListNode> stack1 = new LinkedList<>();
        Deque<ListNode> stack2 = new LinkedList<>();
        while(l1!=null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while(l2!=null){
            stack2.push(l2);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry != 0){
            int x = stack1.isEmpty()? 0:stack1.pop().val;
            int y = stack2.isEmpty()? 0: stack2.pop().val;
            int sum = carry + x + y;
            ListNode node = new ListNode(sum%10);
            carry = sum /10;
            //新建的节点的下一个为之前的节点
            node.next = ans;
            ans = node;
        }
        return ans;
    }
}
