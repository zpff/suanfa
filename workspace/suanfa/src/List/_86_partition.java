package List;

public class _86_partition {
    public ListNode partition(ListNode head, int x) {
        /*if(head == null || head.next == null) return head;
        ListNode theLittleBigNode = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode theLittleBigPreNode = dummy;
        while (theLittleBigNode != null && theLittleBigNode.val < x) {
            theLittleBigNode = theLittleBigNode.next;
            theLittleBigPreNode = theLittleBigPreNode.next;
        }
        if(theLittleBigNode == null) return head;
        ListNode theLittleNode = theLittleBigNode.next;
        ListNode theLittlePreNode = theLittleBigNode;
        while (theLittleNode != null) {
            if (theLittleNode.val < x) {
                theLittlePreNode.next = theLittleNode.next;
                theLittleNode.next = theLittleBigPreNode.next;
                theLittleBigPreNode.next = theLittleNode;
                theLittleNode = theLittlePreNode.next;
            } else {
                theLittleNode = theLittleNode.next;
                theLittlePreNode = theLittlePreNode.next;
            }
        }
        return dummy.next;*/
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while(head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
       _86_partition partition = new _86_partition();
       partition.partition(l1,3);
    }
}
