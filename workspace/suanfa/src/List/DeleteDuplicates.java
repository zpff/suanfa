package List;

import java.util.HashSet;
//删除当前节点
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        HashSet<Integer> hs = new HashSet<>();
        while (cur!=null){
            //set中不包含当前节点的值时，将值存入set，指针后移
            if (!hs.contains(cur.val)){
                hs.add(cur.val);
                pre = cur;
                cur = cur.next;
                //set中包含当前节点的值时，前一个指针指向当前指针的后一节点，当前指针后移
            }else {
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return head;
    }
}
