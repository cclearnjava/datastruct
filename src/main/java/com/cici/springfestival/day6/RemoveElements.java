package com.cici.springfestival.day6;

import java.util.List;

public class RemoveElements {

    public  static ListNode removeElements(ListNode head,int val){
        while(head != null && head.value == val){
            head = head.next;
        }

        if(head == null){
            return head;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.value == val){
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }

    /**
     * 这个递归写法没有看懂
     * @param head
     * @param val
     * @return
     */
    public static  ListNode removeElements1(ListNode head, int val) {
        if(head==null)
            return null;
        head.next=removeElements(head.next,val);
        if(head.value==val){
            return head.next;
        }else{
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next.value = 1;
        head.next.next.value = 3;
        head.next.next.next.value = 6;
        head.next.next.next.next.value = 3;
        head.next.next.next.next.next.value = 5;

        removeElements1(head,3);

    }
}
