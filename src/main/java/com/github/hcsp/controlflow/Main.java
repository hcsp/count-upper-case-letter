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
        int countNum = 0;
        for (int i= 0; i <= str.length()-1;i++){
            char character = str.charAt(i);
            if (Character.isUpperCase(character)){
                countNum = countNum+1;
            }
        }
        return countNum;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
