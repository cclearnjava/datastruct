package com.cici.springfestival.day04;


/**
 * letcode 344 反转字符串
 */
public class ReverseString {

    public void reverString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
