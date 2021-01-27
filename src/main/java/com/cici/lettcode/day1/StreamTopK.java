package com.cici.lettcode.day1;

import java.util.PriorityQueue;


/**
 * Headsort ：堆排序
 * 1：应用场景：  topk
 *              流里面的中值
 *              流里面的中位数
 *
 *
 */
public class StreamTopK {
    final PriorityQueue<Integer> q;
    final int k;

    public StreamTopK(int k ,int[] a){
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for(int n : a){
            add(n);
        }
    }

    public int add(int value){
        if(q.size() < k ){
            q.offer(value);
        }else if( q.peek() < value){ //peek：返回队列头部的元素,如果没有返回为null，跟remove一样，remove会抛出异常
            q.poll();  //poll: 移除并返回队列的头部元素，跟remove差不多
            q.offer(value); //offer: 在一个满的队列中，如果使用offer，会抛出false  ，add则会抛出异常
        }
        return q.peek();
    }
}
