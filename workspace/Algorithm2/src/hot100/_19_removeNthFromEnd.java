package hot100;

public class _19_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode count = head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        int num = 1;
        while (count != null){
            count = count.next;
            num++;
        }
        int k = num - n;
        for (int i = 0; i < k-1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }
}
