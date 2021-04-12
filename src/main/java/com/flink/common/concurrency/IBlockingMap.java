package com.flink.common.concurrency;

public interface IBlockingMap<K,V> {
    V remove(K key);

    void put(K key, V value) throws InterruptedException;

    void clear();

    int size();
}
