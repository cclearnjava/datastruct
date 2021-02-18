package com.cici.springfestival.day04;

public class Reverse {


    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuffer res = new StringBuffer();
        while (i > 0) {
            while (i > 0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i; //j指向下个单词的尾字符
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {

    }
}
