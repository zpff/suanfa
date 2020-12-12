package List;

public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode reverse = ReverseList.reverseList(head);
        ListNode cur = reverse;
        int sum = 0;
        int count = 0;
        while(cur != null){
           sum += Math.pow(2,count) * cur.val;
           count++;
           cur = cur.next;
        }
        return sum;
    }
}
