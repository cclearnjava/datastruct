package com.cici.springfestival.day03hash;

/**
 * lettcode 242 ：有效的字母异味词
 */
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            alpha[s1 - 'a']++;
            alpha[t1 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (alpha[i] != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

     /*   char a = 'a';
        char b = 'c';
        System.out.println(b - a);*/
        String s ="anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
