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
        int a = 0;   // 统计次数的一个基准
        for (int i = 0; i < str.length(); i++) {//循环字符串
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {//判断字符串是不是大写英文字母
                a++;//是大写英文字母基准数据加一
            }
        }
        return a;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
