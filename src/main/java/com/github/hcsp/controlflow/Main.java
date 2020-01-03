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
        int count = 0;
        /*
         * 这里有两个知识点:
         * 1.toCharArray()：将字符串转换为字符数组;
         *demo可以见:https://www.runoob.com/java/java-string-tochararray.html
         *
         * 2.isUpperCase() 方法用于判断指定字符是否为大写字母。
         *用这个函数的时候前面必须要加上Character
         *demo可以参考:https://www.runoob.com/java/character-isuppercase.html
         *
         * 这条题目主要考察1.循环的使用;2.相关函数的使用
         * */
        for (char ch : str.toCharArray()) {
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
