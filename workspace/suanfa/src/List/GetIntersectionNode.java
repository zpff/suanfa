package List;

import java.util.HashSet;
//hashSet 和双指针
public class GetIntersectionNode {
    /*
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        HashSet<ListNode> set = new HashSet<>();
        ListNode cur = headA;
        while (cur!=null){
            set.add(cur);
            cur = cur.next;
        }
        cur = headB;
        while (cur!= null){
            if (set.contains(cur)) {
               return cur;
            }else {
                cur = cur.next;
            }
        }
        return null;
    }

     */
//两个指针都走A+B的长度，起点不同，但是终点相同
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode first = headA;
        ListNode second = headB;

        while(first!=second){
            if(first == null){
                first = headB;
            }else {
                first = first.next;
            }
            if (second == null){
                second = headA;
            }else {
                second = second.next;
            }


        }
        return first;
    }
}
