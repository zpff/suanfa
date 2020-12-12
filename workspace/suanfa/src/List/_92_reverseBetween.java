package List;

public class _92_reverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next ==null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while(m > 1){
            pre = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode tail = cur;
        ListNode con = pre;
        ListNode third = null;
        while (n>0){
            third = cur.next;
            cur.next = pre;
            pre = cur;
            cur = third;
            n--;
        }
        if(con!=null){
            con.next = pre;
        }else {
            head = pre;
        }
        tail.next = cur;
        return head;
    }
}
