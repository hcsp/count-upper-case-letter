package com.github.hcsp.controlflow;

import static java.lang.System.*;

public class Main {
    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        //所以要设置两个变量，一个用来计字符串有多少个字母，另一个用来记有多少个大写字母
        int i = 0;
        int j = 0;
        for (i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                j++;
            }

        }
        System.out.println("该字符串中出现了" + j + "大写英文字母");
        return j;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
