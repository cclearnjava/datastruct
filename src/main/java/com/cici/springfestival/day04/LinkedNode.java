package com.cici.springfestival.day04;


public class LinkedNode {

    int value;
    LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(int value) {
        this.value = value;
    }

    public LinkedNode(int value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }
}
