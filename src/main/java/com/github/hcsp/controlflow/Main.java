package com.github.hcsp.controlflow;

public class Main {
    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isB(str.charAt(i))) {
                ++number;
            }
        }
        return number;
    }

    private static boolean isB(char inn) {
        return 65 <= inn && inn <= 90;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
