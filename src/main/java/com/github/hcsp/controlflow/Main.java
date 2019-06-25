package com.github.hcsp.controlflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int count=0;//定义一个计数器count
           ArrayList<String> arr=new ArrayList<String>();//新建一个arr列表，用于存放字符串中的大写字符。
           for (int i =0; i <str.length() ; i++) {//对字符串进行遍历
            if('A'<=str.toCharArray()[i]&&str.toCharArray()[i]<='Z'){//判断字符是否为大写字符
               arr.add(String.valueOf(str.charAt(i)));//将大写字符存入arr列表中。
                count++;//计数器+1；
            }
           }
            System.out.println("该字符串中出现了"+count+"次大写字符");
            System.out.println("这"+count+"次分别包括"+String.join(",",arr)+"。");
            return count;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
