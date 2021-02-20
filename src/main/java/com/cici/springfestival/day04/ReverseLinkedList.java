package com.cici.springfestival.day04;


/**
 * lettcode 206 链表的翻转
 */
public class ReverseLinkedList {

    public LinkedNode reverseLinkedList(LinkedNode head) {
        LinkedNode pre = null;
        LinkedNode cur = head;
        while (cur != null) {
            LinkedNode next = cur.next;
            cur.next = pre; //翻转
            pre = cur;
            cur = next;
        }
        return  pre;
    }


}
