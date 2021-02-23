package com.cici.springfestival.day6;



import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    /**
     * 用hashset判断，判断hashset是否有添加过head这个节点
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }


    /***
     * 快慢指针来判断是否是环形链表
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return false;
    }
}
