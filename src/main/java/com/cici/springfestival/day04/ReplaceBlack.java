package com.cici.springfestival.day04;


/**
 * 把字符串中的每一个空格替换成 "%20"
 * <p>
 * s = "We are happy"
 * "We%20are%20happy"
 */
public class ReplaceBlack {


    /**
     * 前后指针
     *
     * @param sb
     * @return
     */
    public String replaceBlack(StringBuffer sb) {
        int blackcount = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                ++blackcount;  //算出字符串中有多少个空格
            }
        }

        int oldlength = sb.length();
        int newlength = oldlength + blackcount * 2;  //每次替换一个字符串的长度+2 1个字符变成3个字符
        int oldindex = oldlength - 1;
        int newindex = newlength - 1;
        while (oldindex > 0 && newindex > oldindex) {
            if (sb.charAt(oldindex) == ' ') {
                sb.setCharAt(newindex--, '0');
                sb.setCharAt(newindex--, '2');
                sb.setCharAt(newindex--, '%');
            } else {
                sb.setCharAt(newindex--, sb.charAt(oldindex));
            }
            --oldindex;
        }
        return sb.toString();
    }


    /**
     * java的replace函数
     *
     * @param
     */
    public static String repalceBlack1(StringBuffer sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.replace(i, i + 1, "%20");
            }
        }
        return sb.toString();
    }

    public static String replaceBlack2(String sb) {
        return sb.replaceAll(" ", "%20");
    }


    public static void main(String[] args) {

    }
}
