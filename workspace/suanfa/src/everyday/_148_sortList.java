package everyday;

import List.ListNode;

public class _148_sortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while(left!=null&& right!=null){
            if(left.val < right.val){
                res.next = left;
                left = left.next;
                res = res.next;
            }else{
                res.next = right;
                right = right.next;
                res = res.next;
            }
        }
        if(left!=null){
            res.next = left;
        }else{
            res.next = right;
        }
        return h.next;
    }
}
