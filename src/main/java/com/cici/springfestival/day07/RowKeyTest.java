package com.cici.springfestival.day07;

public class RowKeyTest {

    public static String rowKey(long uid){
        String uid15 = String.format("%015d",uid);
        return uid15;
    }

    public static void main(String[] args) {
        System.out.println(rowKey(123456789));
    }
}
