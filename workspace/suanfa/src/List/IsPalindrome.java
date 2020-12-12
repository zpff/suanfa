package List;

import jdk.nashorn.internal.ir.WhileNode;

public class IsPalindrome {
    //通过快慢指针找到中间节点，然后将剩余的链表反转，逐一比较
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head){
        if (head == null) return true;

        ListNode mid = findMid(head);
        ListNode secondListNode = reverseList(mid.next);


        while(secondListNode!=null){
            if (head.val != secondListNode.val) return false;
            head = head.next;
            secondListNode = secondListNode.next;
        }
        return true;
    }

}
