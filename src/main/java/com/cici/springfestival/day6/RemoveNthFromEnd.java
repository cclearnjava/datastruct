package com.cici.springfestival.day6;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dumy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        ListNode res = dumy.next;
        return res;
    }
}
