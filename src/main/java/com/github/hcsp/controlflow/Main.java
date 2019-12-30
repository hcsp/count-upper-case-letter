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
        //看了优秀答案后
        //我之前也想用foreach循环获取，每一个字符，但是没有仔细去查找如何实现
        //看到答案的toCharArray()函数后，真的是可以
        //（其实也是昨晚老师批改了我作业后，老师尖锐的评论直戳我的痛点，才发现我做题，太焦虑，一心求快）
        //所以，一下是参考优秀答案的修改
        int count = 0;

        for (char ch :str.toCharArray()) {
            //看到有同学用isUpperCase,来判断是否为大写字母，增加代码的可读性
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
