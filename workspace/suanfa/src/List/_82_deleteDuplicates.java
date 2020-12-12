package List;

public class _82_deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode dup = head.next;
        while(dup != null){
            if (cur.val == dup.val) {
                while (dup!=null&&cur.val == dup.val) {
                    dup = dup.next;
                }
                if (dup!=null) {
                    pre.next = dup;
                    cur = dup;
                    dup = dup.next;
                 }else {
                    pre.next =dup;
                }
            }else{
                pre = pre.next;
                cur = cur.next;
                dup = dup.next;
            }
        }
        return dummy.next;
    }
}
