package com.cici.springfestival.day2;

public class SingleLinkedList {


    SingleNode head;

    public SingleLinkedList(){
        head = new SingleNode();  //初始化头结点
    }









    class SingleNode {
        Object data; //存放节点的值
        SingleNode next; //后续节点的引用

        public SingleNode() {

        }

        public SingleNode(Object data) {
            this.data = data;
        }

        public SingleNode(Object data, SingleNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
