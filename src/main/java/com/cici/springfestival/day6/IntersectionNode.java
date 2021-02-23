package com.cici.springfestival.day6;

public class IntersectionNode {

    /**
     * 相交链表的第一个节点， 160
     * @param head1
     * @param head2
     * @return
     */
    public ListNode getIntersectionNode(ListNode head1,ListNode head2){

        if(head1 == null || head2 == null){
            return null;
        }
        ListNode pA = head1;
        ListNode pB = head2;

        while(pA != pB){
            pA = pA == null ?pB:pA.next;
            pB = pB == null ?pB:pB.next;
        }
        return pA;

    }
}
