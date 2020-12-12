package List;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode preNode = new ListNode(-1);
        ListNode pre = preNode;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
        }
        pre = l1 != null ? l1 : l2;
        return  preNode.next;
    }
}
