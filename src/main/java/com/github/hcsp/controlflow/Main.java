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
        String[] strings = str.split("");
        int num = 0;
        for (String string : strings) {
            if(includes(alphabet(),string)) {
                num += 1;
            }
        }
        return num;
    }

    public static boolean includes(String[] arr,String key) {
        int i = arr.length;
        while (i-- > 0) {
            if(key.equals(arr[i])) return true;
        }
        return false;
    }

    public static String[] alphabet() {
        String[] strings = new String[26];
        for(int i = 0; i < 26; i++){
            strings[i] = (char)('A' + i) + "";
        }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(countUpperCaseLetters("AaBbCc1234ABC"));
    }
}
