package List;

public class RemoveElements {

    //可以通过哨兵节点去解决它，哨兵节点广泛应用于树和链表中，如伪头、伪尾、标记等，
    // 它们是纯功能的，通常不保存任何数据，其主要目的是使链表标准化，如使链表永不为空、永不无头、简化插入和删除。

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        ListNode cur = head;
        ListNode pre = sentinel;
        sentinel.next = head;
        while (cur != null) {
            if (cur.val == val) pre.next = cur.next;
            else pre = cur;
            cur = cur.next;
        }
        return sentinel.next;
    }
}