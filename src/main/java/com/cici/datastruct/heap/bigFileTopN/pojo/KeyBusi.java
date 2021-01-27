package com.cici.datastruct.heap.bigFileTopN.pojo;

public class KeyBusi {

    /**
     * 关键字
     */
    private String key;

    /**
     * 关键字次数
     */
    private int countNums;

    public KeyBusi(String key, int countNums) {
        this.key = key;
        this.countNums = countNums;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCountNums() {
        return countNums;
    }

    public void setCountNums(int countNums) {
        this.countNums = countNums;
    }

    @Override
    public String toString() {
        return "KeyBusi{" +
                "key='" + key + '\'' +
                ", countNums=" + countNums +
                '}';
    }
}
