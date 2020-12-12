package List;

public class _148_sortList {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                res.next = left;
                res = res.next;
                left = left.next;
            }else{
                res.next = right;
                res = res.next;
                right = right.next;
            }
        }
        if(left == null){
            res.next = right;
        }else {
            res.next = left;
        }
        return h.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);

        l1.next= l2;
        l2.next=l3;
        l3.next=l4;
        _148_sortList.sortList(l1);
    }
}
