package com.cici.springfestival.day04;


/**
 * 将字符串前面的若干个字符串转移到字符串的尾部
 */
public class ReverseLeftWords {

    /**
     * 剑指offer 58 -二 ，左旋转字符串
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s,int n){
        int len = s.length();
        if (n > len){
            n = len;
        }
        return s.substring(n,len) + s.substring(0,n);
    }

}
