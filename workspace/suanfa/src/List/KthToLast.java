package List;

public class KthToLast {
    public int kthToLast(ListNode head,int k){
        ListNode first = head;
        ListNode second = head;

        while(k-->0){
            first = first.next;
        }
        while(first != null){
            second = second.next;
            first = first.next;
        }
        return second.val;
    }
}
