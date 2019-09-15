package com.github.hcsp.controlflow;

public class Main<count> {
    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        //char[] stringArr = str.toCharArray();
        int count=0;
        //for(int i=0;i<stringArr.length;i++) {
        //    //if(stringArr[i]>=65&&stringArr[i]<=90){
        //    //    count++;
        //    if (stringArr[i] <= 'Z' && stringArr[i] >= 'A') {
        //        count++;
        //    } else {
        //        continue;
        //    }
        //}
        String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Upper.indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int s=countUpperCaseLetters("AaBbCc1234ABC");
        System.out.println(s);
    }
}
