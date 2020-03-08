package com.github.hcsp.controlflow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为 该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        int daxie = 0;
        // List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {//遍历字符串

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {//charAt()取得的字符 是否在A与Z之间
                daxie++;//是则给daxie加1
            }

        }

        System.out.println("大写字母有"+daxie);//输入有几个大写字母
        return  daxie; //返回大写字母数量的值
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");

    }
}
