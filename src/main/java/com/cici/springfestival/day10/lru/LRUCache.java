package com.cici.springfestival.day10.lru;

import java.util.Hashtable;

public class LRUCache {

    public Hashtable<Integer,DLinkedNode> hashtable = new Hashtable<>();
    public int count;
    public int capacity;
    public DLinkedNode head,tail;

    public LRUCache(){
        this.count = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        head.pre = null;

        tail = new DLinkedNode();
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }


    public int get(String key){
        DLinkedNode node = hashtable.get(key);

        if(node == null){
            return -1; //此处应该抛异常
        }

        this.moveTohead(node);
        return node.value;
    }

    private void moveTohead(DLinkedNode node) {

    }

}
