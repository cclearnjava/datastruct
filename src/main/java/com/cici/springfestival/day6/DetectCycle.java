package com.cici.springfestival.day6;

public class DetectCycle {


    /**
     * 找到环形链表的入口处 142
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null){
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        fast = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
